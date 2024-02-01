import java.util.Scanner;

public class Prog12{
    public static void main(String [] jagadeesh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int i=sc.nextInt();
        sc.close();
        if(i==0 || i==1){
            System.out.println("Neither prime nor composite");
            return;
        }
        int count=0;
        for(int j=2;j<i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("Not a prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}