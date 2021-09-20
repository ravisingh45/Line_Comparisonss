package main.com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of x1,y1,x2,y2");
        int coor_x1 = scanner.nextInt();
        int coor_y1 = scanner.nextInt();
        int coor_x2 = scanner.nextInt();
        int coor_y2 = scanner.nextInt();
        System.out.println("enter x1: "+coor_x1);
        System.out.println("enter y1: "+ coor_y1);
        System.out.println("enter x2: "+coor_x2);
        System.out.println("enter y2: "+coor_y1);
        int length1 = (int)(Math.sqrt((coor_x2-coor_x1)^2+(coor_y2-coor_y1)^2));
        System.out.println("length1 of the line is : "+ length1);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter the value of X1,X2,Y1,Y2");
        int Coor_X1 =scanner1.nextInt();
        int Coor_Y1 = scanner1.nextInt();
        int Coor_X2 = scanner1.nextInt();
        int Coor_Y2 = scanner1.nextInt();
        System.out.println("enter x1: "+Coor_X1);
        System.out.println("enter y1: "+Coor_X2);
        System.out.println("enter x2: "+Coor_Y1);
        System.out.println("enter y2: "+Coor_Y2);
       int length2 = (int)(Math.sqrt((Coor_X2-Coor_X1)^2+(Coor_Y2-Coor_Y1)^2));
        System.out.println("length2 of the line is: " + length2);
        if (length1 == length2){
            System.out.println("Both line are equal ");
        }
        else if (length1 <= length2){
            System.out.println("line1 is small then line2");
        }
        else if (length2 <= length1)
        {
            System.out.println("line1 is greater then line2");
        }

    }
}
