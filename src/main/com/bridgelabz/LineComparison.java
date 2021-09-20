package main.com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        int comp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of X1:");
        int x1 = scanner.nextInt();
        System.out.println("enter the value of X2:");
        int x2 = scanner.nextInt();
        System.out.println("enter the value of Y1:");
        int y1 = scanner.nextInt();
        System.out.println("enter the value of Y2:");
        int y2 = scanner.nextInt();
        comp = ((x2 -x1)*2*2+(y2-y1)*2*2);
        System.out.println("length of the line is : "+ comp);

    }
}
