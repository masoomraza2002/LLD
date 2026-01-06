public class Main{
    public static void main(String[] args){
        Runnable task = () -> {
            AppConfig config = AppConfig.getInst();
            System.out.println(
                Thread.currentThread().getName()+" -> "+config.hashCode()
            );
        };

        for(int i=0;i<5;i++){
            new Thread(task).start();
        }
    }
}