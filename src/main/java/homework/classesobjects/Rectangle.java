package homework.classesobjects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int newWidth, int newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public int calculateArea(){
        return width * height;
    }

    public static void main() {
        Rectangle newRectangle = new Rectangle(2, 10);
        newRectangle.setWidth(5);
        System.out.println(newRectangle.calculateArea());
    }
}
