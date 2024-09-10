package AbstractFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int type;
        System.out.println("Select type for products (1 or 2)");
        Scanner sc = new Scanner(System.in);
        type = sc.nextInt();
        while(type != 1 && type != 2){
            System.out.println("please enter valid type (1 or 2)");
            type = sc.nextInt();
        }
        // The condition below simply checks which kind of products to make
        AbstractFactory factory = type == 1 ? new ProductFactory1():new ProductFactory2();
        AbstractProductA prodA = factory.createProductA();
        AbstractProductB prodB = factory.createProductB();
        prodA.printInfo();
        prodB.printInfo();
    }
}
