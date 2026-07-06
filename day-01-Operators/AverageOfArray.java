import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }

        double average = (double) sum / n;

        System.out.println("Average = " + average);

        sc.close();
    }
}