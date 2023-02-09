package com.company.application.web.screens.store;

import com.company.application.config.ProductConfig;
import com.company.application.entity.Store;
import com.company.application.entity.StoreProduct;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;

import javax.annotation.Nullable;
import javax.inject.Inject;
import java.util.List;

@UiController("application_Store.edit")
@UiDescriptor("store-edit.xml")
@EditedEntityContainer("storeDc")
@LoadDataBeforeShow
public class StoreEdit extends StandardEditor<Store> {

    @Inject
    private CollectionPropertyContainer<StoreProduct> storeProductDc;
    @Inject
    private DataContext dataContext;

    @Inject
    private ProductConfig productConfig;

    @Inject
    private Table<StoreProduct> storeProductsTable;

    @Subscribe
    public void onInit(InitEvent event) {
        storeProductsTable.setStyleProvider(new Table.StyleProvider<StoreProduct>() {
            @Nullable
            @Override
            public String getStyleName(StoreProduct entity, @Nullable String property) {
                if (entity.getCount() < productConfig.getCount()) {
                    return "premium-grade";
                }
                return null;
            }
        });
    }

    @Install(to = "storeProductsTable.create", subject = "afterCommitHandler")
    private void storeProductsTableCreateAfterCommitHandler(StoreProduct addedProduct) {
        List<StoreProduct> storeProducts = storeProductDc.getMutableItems();
        for (int i = 0; i < storeProducts.size() - 1; i++) {
            StoreProduct existingProduct = storeProducts.get(i);
            if (existingProduct.getProduct().getId() == addedProduct.getProduct().getId()) {
                existingProduct.setCount(existingProduct.getCount() + addedProduct.getCount());
                storeProducts.remove(storeProducts.size() - 1);
                dataContext.remove(addedProduct);
            }
        }
    }

}