package practice_4;

import static practice_4.Season.WINTER;

public class SwitchTaskSolver {
    public String dayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Day does not exist";

        }
        return dayOfWeek;
    }

    public String describeSeason(Season season) {
        String description = "";
        switch (season) {
            case WINTER -> description = "Зима — холодно и снежно.";
            case SPRING -> description = "Spring - love is everywhere.";
            case SUMMER -> description = "Лето — жарко.";
            case AUTUMN -> description = "Autumn - it is getting sad...";
        }
        return description;
    }

}
