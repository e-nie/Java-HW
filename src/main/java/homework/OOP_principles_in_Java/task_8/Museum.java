package homework.OOP_principles_in_Java.task_8;

import java.util.ArrayList;
import java.util.List;

public class Museum {
    private List<Exhibit> exhibits;

    public Museum() {
        exhibits = new ArrayList<>();
    }

    public void addExhibit(Exhibit exhibit) {
        if (exhibit == null) {
            throw new IllegalArgumentException();
        }
        exhibits.add(exhibit);
    }

    public void exhibitSummary() {
        for (Exhibit exhibit : exhibits) {
            exhibit.showExhibitInfo();
            exhibit.preserveMethod();
        }

    }
}
