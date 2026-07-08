import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int found = 0;

        for (int i = 0; i < n; i++) {

            if (a[i] == key) {
                found = 1;
                System.out.println("Element found at index " + i);
                break;
            }

        }

        if (found == 0) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}