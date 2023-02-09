package com.company.application.web.screens.product;

import com.company.application.entity.Producer;
import com.company.application.entity.Store;
import com.company.application.entity.StoreProduct;
import com.company.application.web.ProducerOption;
import com.company.application.web.StoreOption;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Product;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@UiController("application_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {

    @Inject
    private CollectionContainer<Product> productsDc;
    @Inject
    private CollectionLoader<Product> productsDl;

    private List<UUID> productList = new ArrayList<>();

    @Subscribe
    public void onInit(InitEvent event) {
        ScreenOptions screenOptions = event.getOptions();
        if (screenOptions instanceof StoreOption) {
            Store store = ((StoreOption) screenOptions).getStore();
            List<StoreProduct> storeProductList = store.getStoreProducts();
            for (StoreProduct storeProduct : storeProductList) {
                productList.add(storeProduct.getProduct().getId());
            }
            productsDl.setQuery("select e from application_Product e where e.id IN :store_id");
            productsDl.setView("product-view");
            productsDl.setParameter("store_id", productList);
        } else if (screenOptions instanceof ProducerOption) {
            Producer producer = ((ProducerOption) screenOptions).getProducer();
            productsDl.setQuery("select e from application_Product e where e.producer= :producer");
            productsDl.setView("product-view");
            productsDl.setParameter("producer", producer);
        } else {
            productsDl.setQuery("select e from application_Product e");
        }
        productsDl.setContainer(productsDc);
        productsDl.setDataContext(getScreenData().getDataContext());
    }
}