package Baitap;
public abstract class Shape {
    protected Point centrePoint;
    private static int counter = 0;

    public Shape(Point centrePoint) {
        this.centrePoint = centrePoint;
        this.counter++;
    }

    public static int getShapeCount() {
        return counter;
    }
    
    public Point getCentrePoint() {
        return centrePoint;
    }
    public String toString() {
        return " " + centrePoint;
    }
}
