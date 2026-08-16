package homework.design_patterns.abstract_fabric.furniture;

public class Main {
    static void main(String[] args) {
        FurnitureFactory classicFurnitureFactory = new ClassicFurnitureFactory();
        Chair classicChair = classicFurnitureFactory.createChair();
        Table classicTable = classicFurnitureFactory.createTable();

        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFurnitureFactory.createChair();
        Table modernTable = modernFurnitureFactory.createTable();

        classicChair.use();
        classicTable.use();
        modernChair.use();
        modernTable.use();

    }
}
