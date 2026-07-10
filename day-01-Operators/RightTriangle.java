public class RightTriangle {
    public static void main(String[] args) {
        int rows = 5;
        // Outer loop handles the rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop handles the number of stars per row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
