import java.util.Scanner;
public class areaOfCircle {
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
// Write your code here
double pi = 3.142;
int r = scan.nextInt();
System.out.printf("%.4f",pi*r*r);
}
}