public class EmailObserver  implements  Observer{
    public void update(String mess){
        System.out.println("Email sent : "+mess);
    }
}