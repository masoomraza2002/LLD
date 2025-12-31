package  medium.observer;

import medium.model.OrderEvent;
import medium.model.OrderStatus;

public  interface Observer{
    void update(OrderEvent event);
    boolean supports(OrderStatus status);
}