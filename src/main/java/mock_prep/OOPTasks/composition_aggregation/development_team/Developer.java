package mock_prep.OOPTasks.composition_aggregation.development_team;

public class Developer {
    private String name;
    private String mainStack;


    public Developer(String name, String mainStack) {
        this.name = name;
        this.mainStack = mainStack;
    }

    public String getName() {
        return name;
    }

    public String getMainStack() {
        return mainStack;
    }

    @Override
    public String toString() {
        return getName() + " -  " + getMainStack();
    }
}
