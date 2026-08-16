package homework.design_patterns.abstract_fabric.graphic_elements;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("MacOS button has been rendered");
    }
}
