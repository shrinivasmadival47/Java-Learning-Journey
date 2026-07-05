public class palindromeArray {

    /**
     * Checks if the given array reads the same forward and backward.
     * @param arr the input array to check
     * @return true if the array is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int[] arr) {
        // Handle empty or single-element arrays
        if (arr == null || arr.length <= 1) {
            return true;
        }

        // Initialize two pointers
        int left = 0;
        int right = arr.length - 1;

        // Loop until pointers meet in the middle
        while (left < right) {
            // If any mismatch is found, it's not a palindrome
            if (arr[left] != arr[right]) {
                return false;
            }
            // Move pointers toward the center
            left++;
            right--;
        }

        // All elements matched symmetrically
        return true;
    }

    public static void main(String[] args) {
        // Test Case 1: Palindrome array
        int[] array1 = {1, 2, 3, 2, 1};
        System.out.println("Is array1 a palindrome? " + isPalindrome(array1)); // Output: true

        // Test Case 2: Non-palindrome array
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println("Is array2 a palindrome? " + isPalindrome(array2)); // Output: false
        
        // Test Case 3: Symmetrical even-length array
        int[] array3 = {4, 5, 5, 4};
        System.out.println("Is array3 a palindrome? " + isPalindrome(array3)); // Output: true
    }
}
