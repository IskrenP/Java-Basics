import java.util.Scanner;

public class primer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean isValid = (number >= 100) && (number <= 200) || (number == 0) ;
        if(!isValid)
        {
            System.out.println("invalid");
        }


    }

}