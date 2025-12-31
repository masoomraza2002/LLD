package medium.subject;

import  medium.model.OrderEvent;
import  medium.model.OrderStatus;
import  medium.observer.Observer;

import  java.util.*;

public  class OrderService implements Subject{
    private  final List<Observer> obs = new ArrayList<>();
    private final String orderId;

    public OrderService(String orderId){
        this.orderId  = orderId;
    }

    public void addObserver(Observer observer){
        obs.add(observer);
    }

    public void removeObserver(Observer observer){
        obs.remove(observer);
    }

    public void updateOrderStatus(OrderStatus sts){
        OrderEvent  event = new OrderEvent(orderId , sts);
        notifyObs(event);
    }

    public void notifyObs(OrderEvent event){
        for(Observer ob:obs){
            if(ob.supports(event.getOrderStatus())){
                ob.update(event);
            }
        }
    }
}