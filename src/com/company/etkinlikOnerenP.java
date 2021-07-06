package com.company;
import java.util.Scanner;
/*
*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
* */

public class etkinlikOnerenP {
    public static void main(String[] args) {
        int heat;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Temperature : ");
        heat = scan.nextInt();

        if (heat < 5){
            System.out.println("Suggest Skiing.");
        }else if( heat <=10 ){
            System.out.println("Suggest Cinema.");
        }else if (heat <=15){
            System.out.println("Suggest Tow Event Picnic & Cinema.");
        }else if(heat <=25 ){
            System.out.println("Suggest Picnic");
        }else {
            System.out.println("Suggest Swimming");
        }

    }
}
