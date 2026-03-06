package comparable;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    static void main(String[] args) {
        LocalDate inAWeek = LocalDate.now().plusDays(7);//3
        LocalDate yesterday = LocalDate.now().minusDays(1);// 1
        LocalDate tomorrow = LocalDate.now().plusDays(1);//2


        Task walkTheDog = new Task("Walk the dog", Date.from(inAWeek.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        Task cleanFloor = new Task("Clean Floor", Date.from(yesterday.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        Task sendParcel = new Task("Send Parcel", Date.from(tomorrow.atStartOfDay(ZoneId.systemDefault()).toInstant()));

        TaskManager taskManager = new TaskManager();
        taskManager.addTask(walkTheDog);
        taskManager.addTask(cleanFloor);
        taskManager.addTask(sendParcel);
        System.out.println(taskManager.sortByDeadline());

        taskManager.removeTaskByName("Clean Floor");
        taskManager.removeTaskByName("Pick up the kid");


    }
}
