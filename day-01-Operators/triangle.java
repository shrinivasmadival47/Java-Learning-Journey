class triangle{
    public static void main(String[] args) {
        int rows =5;
        // Uses nested loops to manage spaces and asterisks for centering
    for (int i = 1; i <= rows; i++) {
        for (int j = rows; j > i; j--) System.out.print(" ");
        for (int k = 1; k <= i; k++) System.out.print("* ");
        System.out.println();
    }
}
}