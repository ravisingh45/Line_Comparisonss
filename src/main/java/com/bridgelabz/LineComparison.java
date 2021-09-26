package com.bridgelabz;

public class LineComparison {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public LineComparison(int x1,int y1,int x2,int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
     static void comparison(int length1, int length2){
        if (length1 == length2){
            System.out.println("length line1 is equal to length line2");
        }
        else if (length1 > length2){
            System.out.println("length line1 is greater then length line2");
        }
        else {
            System.out.println("length line 2 is greater then length line1");
        }
    }
     static double formula(LineComparison obj){
        double length = Math.sqrt(Math.pow(obj.x2 - obj.x1, 2) + Math.pow(obj.y2 - obj.y1, 2));
        return length;
    }

    public static void main(String[] args) {
        LineComparison line1 = new LineComparison(3,4,5,5);
        LineComparison line2 = new LineComparison(9,19,13,23);
        int length1 = (int) formula(line1);
        int length2 = (int) formula(line2);
        System.out.println("length1 :" + length1);
        System.out.println("length2 :" + length2);
        comparison(length1,length2);

    }

}

