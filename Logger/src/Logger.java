import java.util.Date;

public class Logger {
    private static Logger instance;
    protected int num = 1;

    private Logger(){}

    public static Logger getInstance(){
        return instance == null ? instance = new Logger(): instance;
    }

    public void log(String msg) {
        System.out.println(new Date() + "[" + num++ + "] " + msg);
    }
}