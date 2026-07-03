public class multiplicationofArray {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};
        int product = 1;

        for (int num : numbers) {
            product *= num;
        }

        System.out.println("Total Product: " + product); // Output: 120
    }
}

