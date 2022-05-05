import java.util.Scanner;

public class Lekciq1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String wd = scanner.nextLine();
        if (wd.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
        
    }
}
    