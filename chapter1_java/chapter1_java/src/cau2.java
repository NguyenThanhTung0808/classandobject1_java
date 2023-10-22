import java.util.Scanner;
public class cau2 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter product code : ");
            String productcode = sc.next();
            System.out.println("Enter price; ");
            double price = sc.nextDouble();
            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();
            double total = price * quantity;
            System.out.println();
            System.out.println(quantity + " " + productcode + "@" + price + "=" + total);
            System.out.println();
        }
    }
}
