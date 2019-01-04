import java.util.Scanner;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name:");

        String name = scanner.nextLine();
        System.out.println("enter id:");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("enter price:");
        double price = Double.parseDouble(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        boolean freeShipping= Boolean.parseBoolean(scanner.nextLine());

        System.out.println(name + "#" +id);
        System.out.println("price:" + symbol + price);
        System.out.println("Free Shipping: "+freeShipping);





    }
}
