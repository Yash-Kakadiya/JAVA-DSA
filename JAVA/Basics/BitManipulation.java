import java.util.*;

public class BitManipulation {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("Even Number");
        } else {
            // odd number
            System.out.println("Odd Number");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return (n | bitMask);
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return (n & bitMask);
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return (n & bitMask);
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                // check LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                // check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // binary AND &
        System.out.println(5 & 6);
        System.out.println("--------------------------------------------------------");

        // binary OR |
        System.out.println(5 | 6);
        System.out.println("--------------------------------------------------------");

        // binary XOR ^
        System.out.println(5 ^ 6);
        System.out.println("--------------------------------------------------------");

        // binary 1's compliment ~
        System.out.println(~(0)); // ~(0)=-1 (according to 8-bit)
        System.out.println("--------------------------------------------------------");

        // binary left shift <<
        System.out.println(5 << 2);
        System.out.println("--------------------------------------------------------");

        // binary right shift >>
        System.out.println(20 >> 2);
        System.out.println("--------------------------------------------------------");

        // Odd or Even
        System.out.println("Enter Integer for Odd or Even :");
        int n = sc.nextInt();
        oddOrEven(n);
        System.out.println("--------------------------------------------------------");

        // get ith bit
        System.out.println("Enter value of Integer to get ith bit :");
        int n1 = sc.nextInt();
        System.out.println("Enter value of index:");
        int i1 = sc.nextInt();
        System.out.println(getIthBit(n1, i1));
        System.out.println("--------------------------------------------------------");

        // set(1) ith bit
        System.out.println("Enter value of Integer to set ith bit :");
        int n2 = sc.nextInt();
        System.out.println("Enter value of index for set(1):");
        int i2 = sc.nextInt();
        System.out.println(setIthBit(n2, i2));
        System.out.println("--------------------------------------------------------");

        // claer(0) ith bit
        System.out.println("Enter value of Integer to clear ith bit :");
        int n3 = sc.nextInt();
        System.out.println("Enter value of index for clear(0):");
        int i3 = sc.nextInt();
        System.out.println(clearIthBit(n3, i3));
        System.out.println("--------------------------------------------------------");

        // update ith bit
        System.out.println("Enter value of Integer to update ith bit :");
        int n4 = sc.nextInt();
        System.out.println("Enter value of i for update:");
        int i4 = sc.nextInt();
        System.out.println("Enter value to be update:");
        int newBit1 = sc.nextInt();
        System.out.println(updateIthBit(n4, i4, newBit1));
        System.out.println("--------------------------------------------------------");

        // clear(0) last i bits
        // update ith bit
        System.out.println("Enter value of Integer to clear(0) last i bits :");
        int n5 = sc.nextInt();
        System.out.println("Enter value of i to clear(0) last i bits :");
        int i5 = sc.nextInt();
        System.out.println(clearIBits(n5, i5));
        System.out.println("--------------------------------------------------------");

        // clear(0) range of bits
        System.out.println("Enter value of Integer to clear(0) range of bits :");
        int n6 = sc.nextInt();
        System.out.println("Enter value of starting index :");
        int i6 = sc.nextInt();
        System.out.println("Enter value of ending index :");
        int j6 = sc.nextInt();
        System.out.println(clearBitsInRange(n6, i6, j6));
        System.out.println("--------------------------------------------------------");

        // check if a number is a power of 2 or not.
        System.out.println("Enter value to check if a number is a power of 2 or not :");
        int n7 = sc.nextInt();
        System.out.println(isPowerOfTwo(n7));
        System.out.println("--------------------------------------------------------");

        // count set bits in a number
        System.out.println("Enter value to count set bits in a number :");
        int n8 = sc.nextInt();
        System.out.println(countSetBits(n8));
        System.out.println("--------------------------------------------------------");

        // fast exponentiation a^n
        System.out.println("Enter value of base(x) to calculate x^y :");
        int n9 = sc.nextInt();
        System.out.println("Enter value of power(y) to calculate x^y :");
        int i9 = sc.nextInt();
        System.out.println(fastExpo(n9, i9));
        System.out.println("--------------------------------------------------------");
    }
}