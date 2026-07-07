import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {

            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }

        System.out.println("Number of Even Elements = " + evenCount);
        System.out.println("Number of Odd Elements = " + oddCount);

        sc.close();
    }
}