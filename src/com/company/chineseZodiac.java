package com.company;

import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        String str ="";
        int year;
        double result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        year = scan.nextInt();
        result = year %12;

        if(result==0){
            str = "Maymum";
        }else if(result==1){
            str = "Horoz";
        }else if(result==2){
            str = "Köpek";
        }else if(result==3){
            str = "Domuz";
        }else if(result==4){
            str = "Fare";
        }else if(result==5){
            str = "Öküz";
        }else if(result==6){
            str = "Kaplan";
        }else if(result==7){
            str = "Tavşan";
        }else if(result==8){
            str = "Ejderha";
        }else if(result==9){
            str = "Yılan";
        }else if(result==10){
            str = "At";
        }else if(result==11){
            str = "Koyun";
        }
        System.out.println(" Çin Zodyağı Burcunuz : " + str);


    }
}
