package lt.vcd.task3;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);

        System.out.print("Coordinate x1: ");
        int x1=in.nextInt();
        System.out.print("Coordinate y1: ");
        int y1=in.nextInt();
        System.out.print("Coordinate x2: ");
        int x2=in.nextInt();
        System.out.print("Coordinate y2: ");
        int y2=in.nextInt();
        int width=x2 - x1;
        int height=y1 - y2;
        int s=width*height;
        int p=2*(width+height);
        System.out.print(s + " " + p);
    }
}
