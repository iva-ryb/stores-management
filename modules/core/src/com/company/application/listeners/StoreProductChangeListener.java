package com.company.application.listeners;

import com.company.application.entity.PriceHistory;
import com.company.application.entity.Product;
import com.company.application.entity.StoreProduct;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.core.global.DataManager;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component("application_StoreProductChangedListener")
public class StoreProductChangeListener {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(StoreProductChangeListener.class);
    @Inject
    private DataManager dataManager;

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void afterCommit(EntityChangedEvent<StoreProduct, UUID> event) {
        StoreProduct storeProduct = dataManager.load(event.getEntityId()).view("storeProduct-view").one();
        if ((event.getChanges().isChanged("price")) &&
                (event.getType() != EntityChangedEvent.Type.DELETED)) {
            try {
                PriceHistory priceHistory = dataManager.create(PriceHistory.class);
                priceHistory.setProduct(storeProduct.getProduct());
                priceHistory.setStore(storeProduct.getStore());
                priceHistory.setPrice(storeProduct.getPrice());
                priceHistory.setDate(new Date());
                priceHistory.setStoreProduct(storeProduct);

                if (storeProduct.getPriceHistories() == null) {
                    List<PriceHistory> priceHistories = new ArrayList<>();
                    storeProduct.setPriceHistories(priceHistories);
                }
                storeProduct.getPriceHistories().add(priceHistory);

                CommitContext commitContext = new CommitContext();
                commitContext.addInstanceToCommit(storeProduct);
                commitContext.addInstanceToCommit(priceHistory);
                dataManager.commit(commitContext);
            } catch (Exception ex) {
                log.info(ex.getMessage());
            }
        }
    }
}
