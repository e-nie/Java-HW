package homework.design_patterns.abstract_fabric.graphic_elements;

public class Main {
    static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Menu windowsMenu = windowsFactory.createMenu();
        Window windowsWindow = windowsFactory.createWindow();


        GUIFactory macFactory = new MacOSFactory();
        Button macButton = macFactory.createButton();
        Menu macMenu = macFactory.createMenu();
        Window macWindow = macFactory.createWindow();

        windowsButton.render();
        windowsMenu.render();
        windowsWindow.render();

        macButton.render();
        macMenu.render();
        macWindow.render();
    }
}
