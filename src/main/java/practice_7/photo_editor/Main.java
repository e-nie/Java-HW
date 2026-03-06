package practice_7.photo_editor;

public class Main {
    static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();

        photoEditor.addNewAction("Eye correction");
        photoEditor.addNewAction("Ear correction");
        photoEditor.addNewAction("Nose correction");
        photoEditor.addNewAction("Body correction");

        photoEditor.printActions();

        photoEditor.undoLastAction();
        photoEditor.undoLastAction();
        photoEditor.undoLastAction();

        photoEditor.printActions();
    }
}
