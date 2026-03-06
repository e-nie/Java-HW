package practice_7.user_monitor;

public class Main {
    static void main(String[] args) {
        UserMonitor userMonitor = new UserMonitor();

        userMonitor.addNewSession("111");
        userMonitor.addNewSession("111");
        userMonitor.addNewSession("111");
        userMonitor.addNewSession("222");
        userMonitor.addNewSession("222");
        userMonitor.addNewSession("222");
        userMonitor.addNewSession("222");
        userMonitor.addNewSession("222");
        userMonitor.addNewSession("222");

        userMonitor.printSessions();

    }
}
