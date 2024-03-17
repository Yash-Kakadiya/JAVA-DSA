/*Write a program that counts the number of objects created using static. */

public class ObjectCount {
    static int numberOfObjects = 0;

    public ObjectCount() {
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void main(String[] args) {
        ObjectCount o1 = new ObjectCount();
        ObjectCount o2 = new ObjectCount();
        ObjectCount o3 = new ObjectCount();

        System.out.println("Number of objects created: " + ObjectCount.getNumberOfObjects());
    }
}
