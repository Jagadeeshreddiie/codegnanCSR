import java.util.Scanner;

public class Prime {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int i = sc.nextInt();
        sc.close();
        if (i == 0 || i == 1) {
            System.out.println("Neither prime nor composite");
            return;
        }
        
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                System.out.println("Not a Prime");
                return;
            }
        }

        System.out.println("prime");

    }
}