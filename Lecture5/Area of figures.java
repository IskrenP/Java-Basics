import java.util.Scanner;

public class Lekciq1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();
        if (figura.equals("triangle")){
            double a = scanner.nextDouble();
            double ha = scanner.nextDouble();
            double areaT = (a * ha) / 2;
            System.out.println(areaT);
        } else if (figura.equals("rectangle")){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double areaT = a * b;
            System.out.println(areaT);
        } else if (figura.equals("square")){
            double a = scanner.nextDouble();
            double area = a * a;
            System.out.println(area);
        } else if (figura.equals("circle")){
            double r = scanner.nextDouble();
            double area = Math.PI * (r * r);
            System.out.println(area);
        }
    }
}
    