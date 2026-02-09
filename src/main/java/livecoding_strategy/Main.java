package livecoding_strategy;

import java.util.List;

public class Main {
    /*
    спроектировать сис-му, кот-я управляет заказом с товарами и скидками
    Шаг 1: Зафиксировать условие

    Два типа товаров:
    Digital Product (fileSize field)
    Physical Product (weight field)


    Два типа скидок:

    Percentage Discount (percentage)
    Fixed Discount (fixed amount)

    ШАГ 2: ПРИМЕР ИСПОЛЬЗОВАНИЯ

   создать заказ1
   положить в заказ1 товар1
   положить в заказ1 [товар2, товар3]
   применить скидку в 20% к заказу1
   применить скидку в EUR 10 к заказу1
   посчитать сумму к оплате заказа1


    Вопросы:
    1) В заказе может быть несколько товаров? ДА
    2) Как мы добавляем товары в заказ? По одному или несоклько? И так и так
    3) Скидка применяется к товару или к заказу? К заказу
    4) можем ли мы применять несолько скидок к заказу? Да
    5) Считаем ли общую сумму? ДА
    6) какие поля/свойства есть у любого товара? Цена, название


    ШАГ 3: проектирование классов и связей

    1) сущности, свойства, связи
    - Product (price, title) - сущность-маркер
    - DigitalProduct(fileSize) inheritance Product
    - PhysicalProduct(weight) inheritance Product


    -Discountable (method discount())
    -PercentageDiscount(percentage) polymorphism, method override(discount)
    -FixedDiscount(fixedAmount)

    -Order (содержит products, содержит discounts) - композиция
    - method calculateTotalPrice()

    ШАГ 4: Реализация программы
    Наследования  - реализуем с пом наследования
    Полиморфизм - если нет общего свойста как ту, то интерфейс
    Композиция  - поля
    Структура данных - Java Collection Framework (быстрое получение доступа - массив, добавление/удаление - список)


    ШАГ 5: Подведение итогов реализации и предложения по будущему улучшению



     */

    static void main(String[] args) {
        /*
         создать заказ1
   положить в заказ1 товар1
   положить в заказ1 [товар2, товар3]
   применить скидку в 20% к заказу1
   применить скидку в EUR 10 к заказу1
   посчитать сумму к оплате заказа1
         */

        Order order = new Order();
        order.addProduct(new DigitalProduct("Lecture", 30, 30));
        order.addProducts(List.of(new PhysicalProduct("Apple", 15, 200),
                new DigitalProduct("Song", 20, 200)));

        order.addDiscount(new PercentageDiscount(20));
        order.addDiscount(new FixedDiscount(20));
        System.out.println(order.calculateTotalPrice());

    }
}
