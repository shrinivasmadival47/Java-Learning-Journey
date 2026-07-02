import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int smallest = a[0];
        int secondSmallest = a[0];

        for (int i = 1; i < n; i++) {

            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            }
            else if (a[i] < secondSmallest && a[i] != smallest) {
                secondSmallest = a[i];
            }

        }

        System.out.println("Second Smallest Element = " + secondSmallest);

        sc.close();
    }
}