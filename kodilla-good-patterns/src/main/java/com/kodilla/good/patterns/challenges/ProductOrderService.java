package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private SellService sellService;
    private SellRepository sellRepository;
    private InformationService informationService;

    public ProductOrderService(SellService sellService, SellRepository sellRepository, InformationService informationService) {
        this.sellService = sellService;
        this.sellRepository = sellRepository;
        this.informationService = informationService;
    }

    public void process(SellRequest sellRequest){
        boolean isSelled = sellService.sell(sellRequest, sellRepository);

        if(isSelled){
            informationService.sendMessage(sellRequest.getUser());
        }
        else{
            System.out.println();
        }
    }
}
