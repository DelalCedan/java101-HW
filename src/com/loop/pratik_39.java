package loop;

import java.util.Scanner;

public class pratik_39 {
    public static void main(String[] args) {
        int n ,sum=0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Please Enter Your Number :");
            n = scan.nextInt();

            if( n%2 == 0 && n%4 ==0){

                sum+=n;

            }

        }while (n > 9);
        System.out.println("===============================");
        System.out.println("Total : " +sum);
    }
}
