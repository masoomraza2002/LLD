package  medium.model;

public  class OrderEvent{
    private final String orderId;
    private final OrderStatus status;

    public OrderEvent(String orderId, OrderStatus status){
        this.orderId = orderId;
        this.status = status;
    }

    public String getOrderId(){
        return  orderId;
    }

    
    public OrderStatus getOrderStatus(){
        return  status;
    }
}