package homework.design_patterns.abstract_fabric.graphic_elements;

public class WindowsMenu implements Menu{
    @Override
    public void render() {
        System.out.println("Windows menu has been rendered");
    }
}
