import java.util.Scanner;

public class Lekciq1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double kvm = scanner.nextDouble();
        double sum = kvm * 7.61;
        double sum1 = 0.18 * sum;
        double sum2 = sum - sum1;
        System.out.printf("The final price is: " + sum2 + " lv. \n" );
        System.out.printf("The discount is: " + sum1 + " lv.");


    }
}