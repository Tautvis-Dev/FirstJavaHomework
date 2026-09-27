package lt.vcd.task1;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);

        System.out.print("Please enter visitors per year: ");
        int n=in.nextInt();
        System.out.print("Please enter books per month: ");
        int v=in.nextInt();
        float k=(float) v * 12 / n;
        System.out.print("Average books per year: " + k);
    }
}
