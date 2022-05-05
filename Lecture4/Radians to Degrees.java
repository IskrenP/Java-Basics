import java.util.Scanner;




public class Lekciq1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double rad = scanner.nextDouble();
        double deg = rad * 180 / Math.PI;
        System.out.println(deg);
    }
}