package loop;

import java.util.Scanner;

public class exponentialNumber {
    public static void main(String[] args) {
        int n ,k ,total=1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base N :");
        n = scan.nextInt();
        System.out.print("Enter the Exponent k :");
        k = scan.nextInt();

        for(int i =1 ; i<=k ; i++){
            total *=n;

        }
        System.out.println("Total :" +total);
    }
}
