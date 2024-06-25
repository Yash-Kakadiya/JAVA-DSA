import java.util.*;

public class DuplicateDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num:");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the Elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate:" + array[i]);
                    index = i;
                    break;
                }
            }
        }

        int newArray[] = new int[n - index];
        int j = 0;
        for (int i = 0; i < index; i++) {
            newArray[j] = array[i];
            j++;
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[j] = array[i];
            j++;
        }

        for (j = 0; j < newArray.length; j++) {
            System.out.println(newArray[j]);
        }

        sc.close();
    }
}
