package mock_prep.OOPTasks.composition_aggregation.university;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate birthDate;

    public Student(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
