package mock_prep.OOP_tasks_1.polymorphism.salary_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Система работает с разными типами сотрудников:
     * <p>
     * сотрудник с фиксированным окладом
     * сотрудник с почасовой оплатой
     * сотрудник с процентом от продаж
     * <p>
     * У каждого сотрудника есть имя.
     * <p>
     * Правила расчета зарплаты:
     * У каждого сотрудника в засимости от типа есть поля:
     * для фиксированная зарплата — месячный оклад
     * для почасовая — количество часов × ставка
     * для процентная — процент × сумма продаж
     * <p>
     * Нужно реализовать систему, которая может выплатить зарплату всем сотрудникам.
     * <p>
     * Требование:
     * <p>
     * Метод, который выплачивает зарплату, должен работать со списком сотрудников, не зная их конкретный тип.
     * Каждый тип сотрудника должен сам рассчитывать свою зарплату.
     * <p>
     * Метод должен вывести:
     * Анна получила 3000
     * Борис получил 2400
     * Мария получила 5000
     */
    static void main(String[] args) {
        Employee anna = new FixedSalaryEmployee("Anna", 5000);
        Employee boris = new HourlySalaryEmployee("Boris", 160, 25);
        Employee maria = new PercentSalaryEmployee("Maria", 0.15,8950);

        List<Employee> employees = new ArrayList<>();
        employees.add(anna);
        employees.add(boris);
        employees.add(maria);

        SalaryPaymentSystem paymentSystem = new SalaryPaymentSystem();
        paymentSystem.sendPaymentAllStaff(employees);
    }
}
