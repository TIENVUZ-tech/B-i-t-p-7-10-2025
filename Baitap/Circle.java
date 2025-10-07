package Baitap;
public class Circle extends Shape {
    public Circle(Point centrePoint) {
        super(centrePoint);
    } 

    @Override
    public String toString() {
        return "Hinh chu nhat[" + centrePoint + "]";
    }
}

