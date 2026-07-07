package mock;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Return true if even, natural
    if null -> Exception Illegal Argument
    if negative -> Exception Illegal Argument


    Система работает с разными типами сотрудников:

сотрудник с фиксированным окладом
сотрудник с почасовой оплатой
сотрудник с процентом от продаж

У каждого сотрудника есть имя.

Правила расчета зарплаты:
У каждого сотрудника в засимости от типа есть поля:
для фиксированная зарплата — месячный оклад
для почасовая — количество часов × ставка
для процентная — процент × сумма продаж

Нужно реализовать систему, которая может выплатить зарплату всем сотрудникам.

Требование:

Метод, который выплачивает зарплату, должен работать со списком сотрудников, не зная их конкретный тип.
Каждый тип сотрудника должен сам рассчитывать свою зарплату.

Метод должен вывести:
Анна получила 3000
Борис получил 2400
Мария получила 5000


     */


    public static boolean isEven(Integer num) {
        if (num == null || num < 0) {
            throw new IllegalArgumentException();
        } else {
            return num % 2 == 0;
        }
    }

    static void main(String[] args) {
        Integer num = 300;//true
        Integer num3 = 301;//false
        Integer num1 = null;//false
        Integer num2 = -10;//false

//        System.out.println(isEven(num));
//        System.out.println(isEven(num1));
//        System.out.println(isEven(num2));
//        System.out.println(isEven(num3));


        //Employee Salary System Task
        FixedRateEmployee fixedRateEmployee = new FixedRateEmployee("Ann", 5000);
        HourlyRateEmployee hourlyRateEmployee = new HourlyRateEmployee("Olaf", 50, 25);
        PercentEmployee percentEmployee = new PercentEmployee("Celine", 0.3, 5800);

        List<Employee> employees = new ArrayList<>();
        employees.add(fixedRateEmployee);
        employees.add(hourlyRateEmployee);
        employees.add(percentEmployee);

        SalaryService service = new SalaryService();
        service.payAll(employees);

    }

}
