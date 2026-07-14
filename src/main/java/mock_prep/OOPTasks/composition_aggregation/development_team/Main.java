package mock_prep.OOPTasks.composition_aggregation.development_team;

public class Main {
    static void main(String[] args) {
        Developer dev1 = new Developer("Alex", "Java");
        Developer dev2 = new Developer("Ben", "JS");
        Developer dev3 = new Developer("John", "Python");
        Developer dev4 = new Developer("Yve", "C#");

        Team team = new Team("Project Sky");

        team.addDeveloper(dev1, "Backend", 5_000);
        team.addDeveloper(dev2, "AQA", 5_000);
        team.addDeveloper(dev3, "DevOps", 15_000);
        team.addDeveloper(dev4, "Frontend", 3_000);

        team.showDevelopers();
        System.out.println();

        team.removeDeveloper("Yve");
        team.showDevelopers();
        System.out.println();

        System.out.println(team.findByName("Ben").getDeveloper());
        team.findByName("Alex").changeRole("Fullstack");
        team.showDevelopers();
        System.out.println();

        team.findByName("John").changeSalary(10_000);
        team.showDevelopers();
        System.out.println();

        System.out.println(team.calculateTotalSalary());
    }

}
