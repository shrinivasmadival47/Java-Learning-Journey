import java.util.Scanner;

public class ArraySmallestNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = scan.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int smallest = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("Smallest element = " + smallest);
    }
}