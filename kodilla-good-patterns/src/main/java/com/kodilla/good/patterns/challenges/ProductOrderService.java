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

    public SellDto process(SellRequest sellRequest){
        boolean isSelled = sellService.sell(sellRequest, sellRepository);

        if(isSelled){
            informationService.sendMessage(sellRequest.getUser());
            return new SellDto(sellRequest.getUser(), sellRequest.getQuantity());
        }
        else{
            return new SellDto(sellRequest.getUser(), -1);
        }
    }
}
