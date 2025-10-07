import java.io.PipedInputStream;
import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> listShape = new ArrayList<>();
        Circle c = new Circle(new Point(1, 02));
        Rectangle r = new Rectangle(new Point(10, 01));
        Square s = new Square(new Point(5, 4));
        listShape.add(c);
        listShape.add(s);
        listShape.add(r);
        System.out.println("Tong so hinh: " + Shape.getShapeCount());
        System.out.println("Danh sach cac hinh: ");
        for (Shape sh : listShape) {
            System.out.println(sh);
        }
        System.out.println("Danh sach tam: ");
        for (Shape sha : listShape) {
            System.out.println(sha.getCentrePoint());
        }
    }
}
