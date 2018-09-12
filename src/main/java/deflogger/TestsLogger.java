package deflogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestsLogger {
    protected static Logger log = LogManager.getLogger();

    public static void startTestCase (String testCase){
        log.info ("**********************************");
        log.info(String.format("TEST CASE IS STARTED", testCase));
        log.info("************************************");

    }

    public static void logStep( String step){
        log.info("##############################");
        log.info(String.format("STEPS %s", step));
        log.info("##############################");

    }

    public static void logStep() {
        int j = 1;
        Throwable t = new Throwable();
        StackTraceElement[] ste = t.getStackTrace();
        String fullClassPath = ste [j].getClassName();
        String [] path = fullClassPath.split("\\.");
        String className = path[path.length-1];
        log.info(String.format("##### STEPS %s.%s",
        className,ste[j].getMethodName()));
    }

}
