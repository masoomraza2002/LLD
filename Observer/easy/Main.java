

public class  Main{
    public static void main(String[] args) {
        OrderService os = new OrderService();
        Observer emaiObserver = new EmailObserver();
        Observer SMSObserver = new SMSObserver();

        os.addObserver(emaiObserver);
        os.addObserver(SMSObserver);

        os.setOrderStatus("order place");
        os.setOrderStatus("order shipped");
    }
}