package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class GlutenFreeShopRepository implements DeliveryRepository {

    private Map<String, Integer> storage;
    @Override
    public boolean isAvailable(String productName, int quantity) {
        if(storage)
    }

    @Override
    public void process(User user, DeliveryRequest deliveryRequest) {

    }

    @Override
    public Map<String, Integer> getStorage() {
        return storage;
    }
}
