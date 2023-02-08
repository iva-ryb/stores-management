package com.company.application.web.screens.purchase;

import com.company.application.entity.PurchaseProduct;
import com.company.application.entity.Store;
import com.company.application.entity.StoreProduct;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Purchase;

import javax.inject.Inject;
import java.util.List;

@UiController("application_Purchase.edit")
@UiDescriptor("purchase-edit.xml")
@EditedEntityContainer("purchaseDc")
@LoadDataBeforeShow
public class PurchaseEdit extends StandardEditor<Purchase> {
    @Inject
    private CollectionPropertyContainer<PurchaseProduct> purchaseProductDc;

    @Inject
    private DataContext dataContext;

    @Inject
    private Notifications notifications;

    @Install(to = "productsTable.create", subject = "afterCommitHandler")
    private void productsTableCreateAfterCommitHandler(PurchaseProduct addedPurchaseProduct) {
        List<PurchaseProduct> purchaseProducts = purchaseProductDc.getMutableItems();
        for (int i = 0; i < purchaseProducts.size() - 1; i++) {
            PurchaseProduct existingPurchaseProduct = purchaseProducts.get(i);
            if (existingPurchaseProduct.getProduct().getId() == addedPurchaseProduct.getProduct().getId()) {
                existingPurchaseProduct.setCount(existingPurchaseProduct.getCount() + addedPurchaseProduct.getCount());
                purchaseProducts.remove(purchaseProducts.size() - 1);
                dataContext.remove(addedPurchaseProduct);
            }
        }
    }

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        List<PurchaseProduct> purchaseProducts = getEditedEntity().getPurchaseProducts();
        if (purchaseProducts == null || purchaseProducts.isEmpty()) {
            notifications.create(Notifications.NotificationType.WARNING).withCaption("Purchase products list is empty.").show();
            event.preventCommit();
            return;
        }
        boolean notEnoughAmount = false;
        StringBuilder notEnoughAmountMessage = new StringBuilder("The following products doesn't have required amount in the store: ");
        for (PurchaseProduct purchaseProduct : purchaseProducts) {
            StoreProduct storeProduct = getEditedEntity().getStore().getStoreProducts().stream()
                    .filter(storeProduct1 -> storeProduct1.getProduct().equals(purchaseProduct.getProduct()))
                    .findAny()
                    .orElse(null);
            if (purchaseProduct.getCount() > storeProduct.getCount()) {
                notEnoughAmountMessage.append(purchaseProduct.getProduct().getName()).append(", ");
                notEnoughAmount = true;
            }
        }
        notEnoughAmountMessage.replace(notEnoughAmountMessage.length() - 2, notEnoughAmountMessage.length() - 1, ".");
        if (notEnoughAmount) {
            notifications.create(Notifications.NotificationType.WARNING).withCaption(notEnoughAmountMessage.toString()).show();
            event.preventCommit();
        } else {
            for (PurchaseProduct purchaseProduct : purchaseProducts) {
                StoreProduct storeProduct = getEditedEntity().getStore().getStoreProducts().stream()
                        .filter(storeProduct1 -> storeProduct1.getProduct().equals(purchaseProduct.getProduct()))
                        .findAny()
                        .orElse(null);
                storeProduct.setCount(storeProduct.getCount() - purchaseProduct.getCount());
                dataContext.merge(storeProduct);
            }
        }
    }
}