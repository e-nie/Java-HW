package homework.design_patterns.abstract_fabric.graphic_elements;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows button has been rendered");
    }
}
