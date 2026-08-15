package homework.design_patterns.singleton.configurationManager;

public class Main {
    static void main(String[] args) {
        ConfigurationManager config1  =  ConfigurationManager.getInstance();
        ConfigurationManager config2  =  ConfigurationManager.getInstance();

       config1.setDatabaseUrl("new/database/");
       config1.setUserName("Alan");
       config1.setPassword("78789");
       config1.setFilePath("/filePath/");
       config1.setLogLevel("INFO");
       config1.setLogFilePath("users/logs");

        System.out.println("Database Url: "  + config1.getDatabaseUrl());
        System.out.println("User name: " + config1.getUserName());
        System.out.println("User Password: " + config1.getPassword());
        System.out.println("File path: " + config1.getFilePath());
        System.out.println("Log level: " + config1.getLogLevel());
        System.out.println("Log file path: " + config1.getLogFilePath());

        System.out.println(config1 == config2);//true
    }
}
