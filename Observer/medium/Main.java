package medium;

import medium.model.OrderStatus;
import medium.observer.EmailObserver;
import medium.observer.Observer;
import medium.observer.SMSObserver;
import medium.subject.OrderService;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OrderService orderService = new OrderService("ORD-101");

        Observer emailObserver = new EmailObserver();
        Observer smsObserver = new SMSObserver();

        orderService.addObserver(emailObserver);
        orderService.addObserver(smsObserver);

        System.out.println("Enter Order Status (PLACED, SHIPPED, DELIVERED, CANCELLED)");
        System.out.println("Type EXIT to stop");

        while (true) {
            System.out.print("\nInput: ");
            String input = sc.nextLine().toUpperCase();

            if (input.equals("EXIT")) {
                System.out.println("System stopped");
                break;
            }

            try {
                OrderStatus status = OrderStatus.valueOf(input);
                orderService.updateOrderStatus(status);
            } catch (IllegalArgumentException e) {
                System.out.println("❌ Invalid status");
            }
        }

    }
}
