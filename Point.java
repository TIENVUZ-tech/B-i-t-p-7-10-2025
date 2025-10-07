public class  Point {
    private double x; //toa do tam theo truc x
    private double y; //toa do tam theo truc y

    /**
     * Constructor
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }
    
    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    } 
}