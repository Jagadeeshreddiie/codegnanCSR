import java.util.Scanner;

public class Prime{
    public static void main(String [] ar){
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
                break;
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