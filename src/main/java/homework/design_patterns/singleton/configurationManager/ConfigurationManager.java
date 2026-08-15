package homework.design_patterns.singleton.configurationManager;

public class ConfigurationManager {
    private String databaseUrl;
    private String userName;
    private String password;
    private String filePath;
    private String logLevel;
    private String logFilePath;

    private static ConfigurationManager configurationManager;

    private ConfigurationManager() {
    }

    ;

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }
}
