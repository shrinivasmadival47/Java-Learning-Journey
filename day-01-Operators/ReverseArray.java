import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Reverse the array in place
        reverse(numbers);
        
        // Output: [50, 40, 30, 20, 10]
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements using a temporary variable
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers toward the middle
            start++;
            end--;
        }
    }
}
