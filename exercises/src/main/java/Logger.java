public class Logger {

    private static Logger instance;
String lastLog = "";
    public static Logger getInstance() {
        if( instance == null) {
            instance = new Logger();

        }
        return instance;

}
public void getLog(String log) {
     lastLog = log;
}
public String getLast() {
    return lastLog;
    }


    public static void main(String[] args) {

Logger.getInstance().getLog("myLOG");
        System.out.println("result" + Logger.getInstance().getLast());

        ;
    }
    }
