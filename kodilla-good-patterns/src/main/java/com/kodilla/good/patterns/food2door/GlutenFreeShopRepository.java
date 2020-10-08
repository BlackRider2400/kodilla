package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class GlutenFreeShopRepository implements DeliveryRepository {

    private Map<String, Integer> storage;

    public GlutenFreeShopRepository(Map<String, Integer> storage) {
        this.storage = storage;
    }

    @Override
    public boolean isAvailable(String productName, int quantity) {

        if(storage.containsKey(productName)){

            if(storage.get(productName) >= quantity){

                return true;
            }
        }

        return false;
    }

    @Override
    public boolean process(User user, DeliveryRequest deliveryRequest) {

        if(isAvailable(deliveryRequest.getProductName(), deliveryRequest.getQuantity())){
            int quantity = storage.get(deliveryRequest.getProductName());
            quantity -= deliveryRequest.getQuantity();

            storage.remove(deliveryRequest.getProductName());
            storage.put(deliveryRequest.getProductName(), quantity);

            return true;
        }

        return false;
    }

    @Override
    public Map<String, Integer> getStorage() {
        return storage;
    }
}
