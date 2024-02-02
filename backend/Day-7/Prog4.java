import java.util.Scanner;
public class Prog4{
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the required size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements into array : ");

        // array input
        for(int cn=0;cn<arr.length;cn++){
            arr[cn]=sc.nextInt();
        }
        // process -- sum of the elements

        int evensum=0, oddsum=0;
        for(int cn=0;cn<arr.length;cn++){
            if(arr[cn]%2==0){
                evensum+=arr[cn];
            }
            else{
                oddsum+=arr[cn];
            }
        }
        // output 

        for(int cn=0;cn<arr.length;cn++){
            System.out.println(cn+" - "+arr[cn]);
        }

        System.out.println("Total Even value is : "+evensum);
        System.out.println("Total Odd value is : "+oddsum);
        sc.close();
    }
}