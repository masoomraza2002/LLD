import java.util.*;

public  class  OrderService implements  Subject{
    private  List<Observer> ll = new ArrayList<>();
    private  String orderStatus;

    public void addObserver(Observer ob){
        ll.add(ob);
    }

    public void removeObserver(Observer ob){
        ll.remove(ob);
    }

    public void setOrderStatus(String status){
        this.orderStatus = orderStatus;
        notifyObserver();
    }


    public void notifyObserver() {
        for(Observer ob:ll){
            ob.update(orderStatus);
        }
    }
}