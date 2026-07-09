import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Copy elements
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        System.out.println("Copied array elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }

        sc.close();
    }
}