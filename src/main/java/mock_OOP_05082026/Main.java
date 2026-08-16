package mock_OOP_05082026;

import mock.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Система работает с разными способами доставки:
     * <p>
     * курьер
     * дрон
     * почта
     * <p>
     * У каждой доставки есть **адрес получателя**.
     * <p>
     * Все доставки умеют:
     * <p>
     * доставлять посылку
     * <p>
     * Но каждая делает это по-своему:
     * <p>
     * курьер везет посылку на машине
     * дрон летит к адресу
     * почта отправляет посылку через сортировочный центр
     * <p>
     * Нужно реализовать систему, которая может **отправить все доставки**.
     * <p>
     * Требование:
     * <p>
     * Метод, который запускает доставку, должен работать **со списком доставок**, не зная их конкретный тип.
     * Каждый тип доставки должен **сам реализовывать**, как происходит доставка.
     * <p>
     * Метод должен вывести, например:
     * <p>
     * Курьер доставляет посылку на ул. Ленина
     * Дрон летит с посылкой на ул. Пушкина
     * Почта отправила посылку через сортировочный центр на ул. Гагарина
     */

    static void main(String[] args) {
        Delivery courier = new CourierDelivery("ул. Ленина");
        Delivery drone = new DroneDelivery("ул. Пушкина");
        Delivery post = new PostDelivery(" на ул. Гагарина");

        List<Delivery> employeeList = new ArrayList<>();
        employeeList.add(courier);
        employeeList.add(drone);
        employeeList.add(post);

        DeliveryService service = new DeliveryService();
        service.sendAll(employeeList);
    }
}

