package homework.design_patterns.abstract_fabric.graphic_elements;

public class MacOSWindow implements Window{
    @Override
    public void render() {
        System.out.println("MacOS window has been rendered");
    }
}
