
public class AppConfig {
    private static AppConfig inst;

    private AppConfig(){
        System.out.println("App config");
    }

    public static synchronized AppConfig getInst(){
        if(inst == null){
            inst = new AppConfig();
        }
        return inst;
    }

    public String getVal(String key){
        return "value for " + key;
    }
}
