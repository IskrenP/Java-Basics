import java.util.Scanner;

public class Lekciq1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number = scanner.nextInt();
        System.out.printf("The architect " + name + " will need " + number * 3 + " hours to complete " + number + " project/s.");

    }
}