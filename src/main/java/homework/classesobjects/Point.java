package homework.classesobjects;

public class Point {
   private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX){
        this.x = newX;
    }

    public void print(){
        System.out.println("Coordinates - x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        Point newPoint = new Point(5, 10);
        newPoint.setX(7);
        newPoint.print();
    }


}
