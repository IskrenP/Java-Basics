import java.util.Scanner;
 
public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int countChicken = Integer.parseInt(scanner.nextLine());
        int countFish = Integer.parseInt(scanner.nextLine());
        int countVegan = Integer.parseInt(scanner.nextLine());
 
        double priceAllChicken = countChicken * 10.35;
        double priceAllFish = countFish * 12.40;
        double priceAllVegan = countVegan * 8.15;
 
        double priceAllMenus = priceAllChicken + priceAllFish + priceAllVegan;
        double dessertPrice = priceAllMenus * 0.20;
 
        double totalPrice = priceAllMenus + dessertPrice + 2.5;
 
        System.out.println(totalPrice);
    }
}
 