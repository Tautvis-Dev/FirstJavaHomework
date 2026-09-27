package lt.vcd.task4;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.print("Length a: ");
        int a=in.nextInt();
        System.out.print("Length b: ");
        int b=in.nextInt();
        System.out.print("Length c: ");
        int c=in.nextInt();
        double p=(a+b+c) / 2.0;
        double s=Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.print(s);
    }
}
