import java.util.Scanner;

public class Lekciq1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String age = scanner.nextLine();
        String city = scanner.nextLine();


        String str = "You are " + firstName + " " + lastName + "," + " a " + age + "-years old person from " + city + ".";
        System.out.println(str);
    }
}
