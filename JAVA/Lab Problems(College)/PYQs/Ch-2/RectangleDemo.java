class Rectangle {
    double width;
    double height;

    // No-arg constructor
    public Rectangle() {
        width = 1.0; // default width
        height = 1.0; // default height
    }

    // Constructor with specified width and height
    public Rectangle(double width, double height) {
        width = this.width;
        height = this.height;
    }

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        // Create a default rectangle
        Rectangle r1 = new Rectangle();
        System.out.println("Area of default rectangle: " + r1.getArea());
        System.out.println("Perimeter of default rectangle: " + r1.getPerimeter());

        // Create a rectangle with specified width and height
        Rectangle r2 = new Rectangle(4.0, 5.0);
        System.out.println("Area of custom rectangle: " + r2.getArea());
        System.out.println("Perimeter of custom rectangle: " + r2.getPerimeter());
    }
}
