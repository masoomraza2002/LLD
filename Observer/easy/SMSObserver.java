public class SMSObserver  implements  Observer{
    public void update(String mess){
        System.out.println("SMS  sent : "+mess);
    }
}