package practice_7.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    //реализуем само хранение:
    //array, index - number of a month
    private ArrayList<Double> costsPerMonth;// нуюно сначала инициализировать, либо сразу тут, либо через конструктор
    //private ArrayList<Double> costsPerMonth = new ArrayList<>(); // это если сразу тут

      public CostCounter() {
        this.costsPerMonth = new ArrayList<>();
    }

    //метод добавления значения по номеру месяца (от 1 до 12) и расходам в этом месяце
    public void addCosts(int month, Double costs) {
        costsPerMonth.add(month - 1, costs);
    }

    //method получения расхода по месяцу:
    public Double getCosts(int month) {
        return costsPerMonth.get(month - 1);
    }

    //считать месяц с минимальным расходом
    public Double getMinCostMonth() {
          AtomicReference<Double> min = new AtomicReference<>(costsPerMonth.getFirst());
          costsPerMonth.forEach(
                  costsPerMonth -> {
                            if(costsPerMonth < min.get()) {
                                min.set(costsPerMonth);
                            }
                  }
          );
          return min.get();
    }


}
