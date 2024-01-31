// simple program to calculate the area of a triangle.

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base : ");
        double base=sc.nextDouble();
        System.out.println("Enter height : ");
        double height=sc.nextDouble();
        System.out.println("The area of triangle is : "+(base*height)/2);
        sc.close();
    }
}
