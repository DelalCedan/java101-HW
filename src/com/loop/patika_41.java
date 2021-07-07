package loop;

import java.util.Scanner;

public class patika_41 {

    public static void main(String[] args) {
        int n , r;
        int factor1=1;
        int factor2=1;
        int factoe3=1;


        Scanner scan=new Scanner(System.in);
        System.out.print("Please Enter Number N :");
        n=scan.nextInt();

        System.out.print("Please Enter Number R :");
        r=scan.nextInt();

        while(n<r){

            System.out.println("N Should be Greater than R. Please Enter N again.");
            n=scan.nextInt();
        }


        for(int i=1;i<=n;i++){

            factor1 *=i;
        }
        System.out.println("N! : " + factor1);

        for(int j=1;j<=r;j++){

            factor2*=j;
        }
        System.out.println("R! : " + factor2);

        int fark=n-r;
        for(int k=1;k<=fark;k++){

            factoe3*=k;
        }
        System.out.println("(N-R)! : " + factoe3);

        int denom=factor2*factoe3;
        int C=factor1/denom;

        System.out.println("C(" + n + "," + r + ") = " +C);

        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + C);



    }
}
