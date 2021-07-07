package loop;
/*
    0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı.
*/

import java.util.Scanner;

public class pratik_41 {
    public static void main(String[] args) {
        int sum =0 , n , count=0;
        double avr=0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter Your Number :");
        n = scan.nextInt();

        for(int i = 0 ; i<=n ;i++){
            if(i%3 == 0 && i%4==0 ){

                sum += i;
                count ++ ;
               avr = sum/count;
            }

        }
        System.out.println("Average : " +avr);
    }
}
