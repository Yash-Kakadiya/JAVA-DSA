/*Design a class named MyPoint to represent a point with x and y-
    coordinates. The class contains: 
        a.  The data fields x and y that represent the coordinates with 
        getter methods. 
        b.  A no-arg constructor that creates a point (0, 0). 
        c.  A constructor that constructs a point with specified 
        coordinates. 
        d.  A method named distance that returns the distance from this 
        point to a specified point of the MyPoint type. 
        e.  A method named distance that returns the distance from this 
        point to another point with specified x- and y-coordinates.
 */

public class MyPointDemo {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(3, 4);

        System.out.println("Point1: (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("Point2: (" + p2.getX() + "," + p2.getY() + ")");

        System.out.println("--------------------------------------------------------");
        System.out.println("Distance between Point1 and Point2: " + p1.distance(p2));
        System.out.println("--------------------------------------------------------");
        System.out.println("Distance between Point1 and (5, 6): " + p1.distance(5, 6));
    }
}

class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint p) {
        double xD = this.x - p.getX();
        double yD = this.y - p.getY();
        return Math.sqrt((xD * xD) + (yD * yD));
    }

    public double distance(double x, double y) {
        double xD = this.x - x;
        double yD = this.y - y;
        return Math.sqrt((xD * xD) + (yD * yD));
    }
}
