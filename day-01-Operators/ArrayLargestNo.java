import java.util.Scanner;
public class ArrayLargestNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int max = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest number is: " + max);
    }

    
}
