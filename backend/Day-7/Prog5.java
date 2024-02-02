import java.util.Scanner;
public class Prog5 {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int cols=sc.nextInt();
        int[][] multi=new int[rows][cols];
        System.out.println("Enter the "+(rows*cols)+" values :");

        // input 
        for(int r=0;r<multi.length;r++){
            for(int c=0;c<multi[r].length;c++){
                multi[r][c]=sc.nextInt();
            }
        }

        //output
        for(int r=0;r<multi.length;r++){
            for(int c=0;c<multi[r].length;c++){
                System.out.print(multi[r][c]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
