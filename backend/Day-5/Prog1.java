// simple program to demonstrate the use of Scanner 

import java.util.Scanner;

public class Prog1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=sc.nextInt();
        System.out.println("Enter name : ");
        String name=sc.next();
        System.out.println("Number : "+num+", name : "+name);
        sc.close();
    }
}