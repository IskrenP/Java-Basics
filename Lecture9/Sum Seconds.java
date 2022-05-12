import java.util.Scanner;
 
public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
 
        int sumSec = first + second + third;
 
        //124 sec
        int min = sumSec / 60;
        int sec = sumSec % 60;
 
        //System.out.printf("%d:%02d%n", min, sec);
 
        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);
        } else {
            System.out.printf("%d:%d", min, sec);
        }
    }
}
 