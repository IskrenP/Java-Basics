import java.util.Scanner;

public class Lekciq1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double increase = deposit * (percent / 100);
        double monthlyIncrease = increase / 12;

        double sum = deposit + (months * monthlyIncrease);

        System.out.println(sum);
    }
}
    