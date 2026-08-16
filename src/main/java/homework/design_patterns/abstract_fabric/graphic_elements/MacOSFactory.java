package homework.design_patterns.abstract_fabric.graphic_elements;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton() {

        };
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }

    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }
}
