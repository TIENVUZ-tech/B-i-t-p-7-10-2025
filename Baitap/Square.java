package Baitap;
public class Square extends Rectangle {
    public Square(Point centrePoint) {
        super(centrePoint);
    } 

    @Override
    public String toString() {
        return "Hinh Vuong[" + centrePoint + "]";
    }
}
