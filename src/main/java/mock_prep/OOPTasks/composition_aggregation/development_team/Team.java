package mock_prep.OOPTasks.composition_aggregation.development_team;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<TeamMember> developerTeam;

    public Team(String name) {
        this.name = name;
        developerTeam = new ArrayList<>();
    }

    public void addDeveloper(Developer developer, String role, double salary) {
        TeamMember teamMember = new TeamMember(developer, role, salary);
        developerTeam.add(teamMember);
    }

    public void removeDeveloper(String name) {
        for (int i = 0; i < developerTeam.size(); i++) {
            if (developerTeam.get(i).getDeveloper().getName().equals(name)) {
                developerTeam.remove(i);
                return;
            }
        }
    }

    public TeamMember findByName(String name) {
        for (TeamMember developer : developerTeam) {
            if (developer.getDeveloper().getName().equals(name)) {
                return developer;
            }
        }
        return null;
    }

    public void showDevelopers() {
        for (TeamMember developer : developerTeam) {
            System.out.println(developer.getDeveloper().getName() + " - " +
                    developer.getDeveloper().getMainStack() + " - " +
                    developer.getRole() + " - " +
                    developer.getSalary()
            );
        }
    }

    public double calculateTotalSalary() {
        double total = 0;
        for (TeamMember developer : developerTeam) {
            total += developer.getSalary();
        }
        return total;
    }
}
