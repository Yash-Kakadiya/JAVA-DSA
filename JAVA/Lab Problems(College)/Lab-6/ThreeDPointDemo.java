/*Create a class named ThreeDPoint to model a point in a three-
    dimensional space. Let ThreeDPoint be derived from MyPoint with 
    following additional features: 
        a.  A data fields named z that represents the z-coordinate. 
        b.  A no-arg constructor that creates a point (0, 0, 0). 
        c.  A constructor that constructs a point with three specified 
            coordinates. 
        d.  A get method that returns the z value. 
        e.  Override the distance method to return the distance between 
            two points in the three-dimensional space. 
        f.  Write a program that creates two points (0, 0, 0) and (10, 
            30, 25.5) and display the distance between the two points. */

public class ThreeDPointDemo {

    public static void main(String[] args) {

        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);

        System.out.println("Point1: (" + p1.getX() + "," + p1.getY() + "," + p1.getZ() + ")");
        System.out.println("--------------------------------------------------------");
        System.out.println("Point2: (" + p2.getX() + "," + p2.getY() + "," + p2.getZ() + ")");
        System.out.println("--------------------------------------------------------");
        System.out.println("Distance between the two points: " + p1.distance(p2));
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

}

class ThreeDPoint extends MyPoint {

    private double z;

    public ThreeDPoint() {
        this(0, 0, 0);
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double distance(ThreeDPoint p) {

        double xD = this.getX() - p.getX();
        double yD = this.getY() - p.getY();
        double zD = this.z - p.getZ();
        return Math.sqrt(xD * xD + yD * yD + zD * zD);

    }
}
