public class Square extends Shape {
    public Square(Point centrePoint) {
        super(centrePoint);
    } 

    @Override
    public String toString() {
        return "Hinh Vuong[" + centrePoint + "]";
    }
}
