import java.util.Scanner;

public class Lekciq1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int nylonQuantity = Integer.parseInt(scanner.nextLine());
        int paintQuantity = Integer.parseInt(scanner.nextLine());
        int razrQuantity = Integer.parseInt(scanner.nextLine());
        int countHours = Integer.parseInt(scanner.nextLine());

        double priceAllNylon = (nylonQuantity + 2) * 1.50;
        double priceAllPaint = (paintQuantity * 1.10) * 14.50;
        double priceAllRazr = razrQuantity * 5.00;

        double allMaterialsPrice = priceAllNylon + priceAllPaint + priceAllRazr + 0.40;
        double workersSum = (allMaterialsPrice * 0.30) * countHours;

        double totalSum = allMaterialsPrice + workersSum;

        System.out.println(totalSum);
    }
}
    