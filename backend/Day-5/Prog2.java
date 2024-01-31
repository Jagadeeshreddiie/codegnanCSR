// simple program to calculate the area of a triangle.

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base : ");
        double base=sc.nextDouble();
        System.out.println("Enter height : ");
        double height=sc.nextDouble();
        // double area=((double)1/2)*base*height;

        // 1/2   gives 0 because... int/int gives int --> 0
        // so we have to make 1 double by (typecasting)
         
        System.out.println("The area of triangle is : "+((double)1/2)*base*height);
        sc.close();
    }
}
