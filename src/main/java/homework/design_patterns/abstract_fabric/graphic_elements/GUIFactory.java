package homework.design_patterns.abstract_fabric.graphic_elements;

public interface GUIFactory {
    Button createButton();
    Menu createMenu();
    Window createWindow();
}
