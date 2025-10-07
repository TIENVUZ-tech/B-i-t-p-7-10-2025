package Baitap;
import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> listShape = new ArrayList<>();

        // Khởi tạo các hình
        Circle c = new Circle(new Point(1, 2));         // Tâm (1,2)
        Rectangle r = new Rectangle(new Point(10, 1)); // Tâm (10,1)
        Square s = new Square(new Point(5, 4));         // Tâm (5,4)

        listShape.add(c);
        listShape.add(s);
        listShape.add(r);

        System.out.println("Tổng số hình: " + Shape.getShapeCount());

        System.out.println("\nDanh sách các hình:");
        for (Shape sh : listShape) {
            System.out.println(" - " + sh);
        }

        System.out.println("\nDanh sách tâm:");
        for (Shape sha : listShape) {
            System.out.println(" - " + sha.getCentrePoint()); // đúng tên hàm
        }
    }
}
