package com.kodilla.good.patterns.food2door;

public class DeliveryOrderProcessor {
    private DeliveryRepository deliveryRepository;
    private DeliveryInformationService DeliveryInformationService;

    public DeliveryOrderProcessor(DeliveryRepository deliveryRepository, DeliveryInformationService DeliveryInformationService) {
        this.deliveryRepository = deliveryRepository;
        this.DeliveryInformationService = DeliveryInformationService;
    }

    public DeliveryDto process(DeliveryRequest deliveryRequest){
        
        if(deliveryRepository.process(deliveryRequest.getUser(), deliveryRequest)){
            DeliveryInformationService.sendConfirmationMessage(deliveryRequest.getUser());
            
            return new DeliveryDto(deliveryRequest.getUser(), deliveryRequest.getQuantity());
        }
        else{
            DeliveryInformationService.sendFailureMessage(deliveryRequest.getUser());
            
            return new DeliveryDto(deliveryRequest.getUser(), -1);
        }
        
    }
}
