package loop;

import java.util.Scanner;

public class patika_40 {
    public static void main(String[] args) {
        int n ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your Number :");
        n = scan.nextInt();

        for(int i=1 ; i<= n ; i*=4){
            System.out.println("4's Forces :" +i);
        }
        System.out.println("------------------------");
        for(int j=1 ; j<=n ; j*=5){
            System.out.println("5's Forces :" +j);
        }
    }
}
