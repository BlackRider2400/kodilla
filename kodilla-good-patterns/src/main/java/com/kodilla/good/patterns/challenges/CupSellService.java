package com.kodilla.good.patterns.challenges;

public class CupSellService implements SellService{
    @Override
    public boolean sell(SellRequest sellRequest, SellRepository sellRepository) {
        if(sellRequest.getQuantity() > sellRepository.getQuantity()){
            return false;
        }
        else{
            return true;
        }
    }
}
