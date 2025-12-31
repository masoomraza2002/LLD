package  medium.observer;

import medium.model.OrderEvent;
import medium.model.OrderStatus;

public  class SMSObserver implements Observer{
    public void update(OrderEvent event){
        System.out.println("Id : "+event.getOrderId() + " status : "+event.getOrderStatus());
    }

    public boolean supports(OrderStatus status){
        return status == OrderStatus.SHIPPED;
    }
}