import java.util.Scanner;

public class Lekciq1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int hranak = scanner.nextInt();
        int hranaKotki = scanner.nextInt();
        double suma = hranak * 2.50 + hranaKotki * 4;
        System.out.printf(suma + " lv.");

    }
}

    