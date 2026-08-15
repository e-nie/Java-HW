package homework.design_patterns.singleton.logger;

public class Main {
    static void main(String[] args) {
        Logger logger1  = Logger.getInstance();
        Logger logger2  = Logger.getInstance();

        logger1.info("INFO: Database connected successfully");
        logger1.error("ERROR: Operation error");
        logger1.warning("WARNING: method deprecated");

        System.out.println(logger1==logger2);//true
    }
}
