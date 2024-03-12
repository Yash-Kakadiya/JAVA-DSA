package OOPS;

public class Static {
    /*
     * Static Keyword->used to share the same variable or method of a given class.
     * -properties
     * -functions
     * -blocks { }
     * -nested classes
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schooName = "ABC";

        Student s2 = new Student();
        System.out.println(s2.schooName);

        Student s3 = new Student();
        s1.schooName = "XYZ";
    }
}

class Student {
    String name;
    int roll;

    static String schooName;
    
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }
}