package lt.vcd.task2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);

        System.out.print("Please enter room width: ");
        double width=in.nextDouble();
        System.out.print("Please enter room length: ");
        double length=in.nextDouble();
        System.out.print("Please enter tiles price: ");
        double price=in.nextDouble();

        double finalPrice=(width * length) * price * 1.05;
        System.out.print("Total price: " + finalPrice);

    }
}
