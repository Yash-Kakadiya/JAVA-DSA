/*Demonstrate the use of Final Keyword.  */
final class Final {
    final int n = 7;

    final void finalMethod() {
        // n = 2;
        System.out.println("n=" + n);
    }

    // final void finalMethod(){
    // int a=1;
    // }
}

// class SubClass extends Final { }

public class FinalDemo {

    public static void main(String[] args) {

        Final obj = new Final();
        obj.finalMethod();
    }
}
