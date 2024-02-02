import java.util.Scanner;

public class Prog6 {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int rows = sc.nextInt();

        int[][] multi = new int[rows][];
        // System.out.println("Enter the values :");

        // input
        for (int r = 0; r < multi.length; r++) {
            System.out.println("Enter no. of columns for "+(r+1)+" row : ");
            int cols = sc.nextInt();

            // initializing every single array dynamic of size
            
            multi[r]=new int[cols];
            for (int c = 0; c < cols; c++) {
                multi[r][c] = sc.nextInt();
            }
        }

        // output
        for (int r = 0; r < multi.length; r++) {
            for (int c = 0; c < multi[r].length; c++) {
                System.out.print(multi[r][c] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
