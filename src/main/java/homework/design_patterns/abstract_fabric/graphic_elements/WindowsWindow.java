package homework.design_patterns.abstract_fabric.graphic_elements;

public class WindowsWindow implements Window{
    @Override
    public void render() {
        System.out.println("Windows window has been rendered");
    }
}
