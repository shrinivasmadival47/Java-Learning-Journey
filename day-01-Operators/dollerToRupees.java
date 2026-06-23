
import java.util.Scanner;

public class dollerToRupees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int doller=sc.nextInt();
        double rupees=doller*82.73;
        System.err.printf("%.4f",rupees);

    }
}
