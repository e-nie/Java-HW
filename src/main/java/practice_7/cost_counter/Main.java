package practice_7.cost_counter;

public class Main {
    static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1, 250.23);
        costCounter.addCosts(2, 260.28);
        costCounter.addCosts(3, 270.13);
        costCounter.addCosts(4, 1270.13);
        costCounter.addCosts(5, 55270.13);


        System.out.println(costCounter.getCosts(5));
        System.out.println(costCounter.getMinCostMonth());

    }
}
