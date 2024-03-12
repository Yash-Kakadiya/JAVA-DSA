package OOPS;

public class Polymorphism {
    /*
     * Polymorphism-> two types
     * (i)Compile Time Polymorphism -> Method overloading->Static Polymorphism
     * (ii)Run Time Polymorphism -> Method Overriding->Dynamic Polymorphism
     */
    /*
     * (i)Compile Time Polymorphism -> Method overloading->Static Polymorphism
     * multiple functions with same name by different parameters
     * 
     * (iii)Run Time Polymorphism -> Method Overriding->Dynamic Polymorphism
     * parent and child classes both contains the same function with a different
     * definition
     */
    public static void main(String[] args) {
        Calculater calc = new Calculater();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float) 1.5, (float) 2.5));
        System.out.println(calc.sum(1, 2, 3));

        Deer d=new Deer();
        d.eat();
    }

}

class Calculater {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}