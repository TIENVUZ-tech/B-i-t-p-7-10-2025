public class Rectangle extends Shape {
    
    public Rectangle(Point centrePoint) {
        super(centrePoint);
    } 

    @Override
    public String toString() {
        return "Hinh chu nhat[" + centrePoint + "]";
    }
}
