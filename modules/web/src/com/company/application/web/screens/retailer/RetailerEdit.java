package com.company.application.web.screens.retailer;

import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;
import com.company.application.entity.Retailer;
import com.company.application.entity.Store;
import com.company.application.entity.StoreProduct;
import com.haulmont.addon.maps.gis.utils.GeometryUtils;
import com.haulmont.addon.maps.web.gui.components.layer.style.FontPointIcon;
import com.haulmont.addon.maps.web.gui.components.layer.style.GeometryStyle;
import com.haulmont.addon.maps.web.gui.components.layer.style.PointStyle;
import com.haulmont.charts.gui.components.charts.Chart;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.LayoutClickNotifier;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import org.locationtech.jts.geom.Point;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@UiController("application_Retailer.edit")
@UiDescriptor("retailer-edit.xml")
@EditedEntityContainer("retailerDc")
@LoadDataBeforeShow
public class RetailerEdit extends StandardEditor<Retailer> {
    private static final String API_KEY_OPEN_CAGE = "80990c70fcec453faec21d3cf27a11d7";
    @Inject
    private CollectionPropertyContainer<Store> storesDc;
    @Inject
    private DataManager dataManager;
    @Inject
    private CollectionPropertyContainer<StoreProduct> storeProductsDc;

    @Subscribe(id = "storesDc", target = Target.DATA_CONTAINER)
    public void onStoresDcCollectionChange(CollectionContainer.CollectionChangeEvent<Store> event) {
        JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(API_KEY_OPEN_CAGE);

        for (Store store : storesDc.getMutableItems()) {
            JOpenCageForwardRequest request = new JOpenCageForwardRequest(store.getAddress().getCity() + " "
                    + store.getAddress().getStreet() + " "
                    + store.getAddress().getBuilding());
            request.setRestrictToCountryCode("ru");

            JOpenCageResponse response = jOpenCageGeocoder.forward(request);
            JOpenCageLatLng firstResultLatLng = response.getFirstPosition();

            Point location = GeometryUtils.createPoint(firstResultLatLng.getLng(), firstResultLatLng.getLat());
            store.setLocation(location);
            dataManager.commit(store);
        }
    }

    @Install(to = "storeMap.storeLayer", subject = "styleProvider")
    private GeometryStyle storeMapStoreLayerStyleProvider(Store store) {
        return new PointStyle(
                new FontPointIcon(CubaIcon.SHOPPING_BASKET)
                        .setIconPathFillColor("#0051d3"));
    }

    @Install(to = "storeMap.storeLayer", subject = "tooltipContentProvider")
    private String storeMapStoreLayerTooltipContentProvider(Store store) {
        return store.getName() + " " +
                store.getAddress().getStreet() + " " +
                store.getAddress().getBuilding();
    }

    @Subscribe("profitStructureTab")
    public void onProfitStructureTabLayoutClick(LayoutClickNotifier.LayoutClickEvent event) {
        List<Store> items = storesDc.getItems();
        List<StoreProduct> storeProducts = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            storeProducts.addAll(items.get(i).getStoreProducts());
        }
        storeProductsDc.setDisconnectedItems(storeProducts);
    }
}