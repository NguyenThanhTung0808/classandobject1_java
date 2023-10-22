import model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.code = "java";
        product1.description = "beginning java";
        product1.price = 49.5;

        product1.setCode("java");
        product1.setDescription("beginning java");
        product1.setPrice(49.5);

        Product product2 = new Product();
        product2.code = "sql";
        product2.description = "Strucque query language";
        product2.price = 59.0;
        product2.setCode("sql");
        product2.setDescription("Strucque query language");
        product2.setPrice(59.0);

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Gia Tri Code");
        String code = input.next();
        product1.setCode(code);

        System.out.println("Nhap gia tri description ");
        String description = input.next();
        product1.setDescription(description);

        System.out.println("Nhap gia tri price");
        String price = input.next();
        double convertD = Double.parseDouble(price);
        product1.setPrice(convertD);
    }
}