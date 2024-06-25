import java.util.Arrays;

public class SortByName {

    public static void main(String[] args) {
        String[] arr = { "Ronit", "Yash", "Mihir" };
        System.out.println("Before:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------------------------");
        System.out.println("After:");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}