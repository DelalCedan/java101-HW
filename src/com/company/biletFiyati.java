package com.company;

import java.util.Scanner;

public class biletFiyati {
    public static void main(String[] args) {

            double distance,normaltotal ,ageDiscont ,discont ,roundDiscont,totalDiscond;
            int age , tripType;

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the Distance in KM :");
            distance = scan.nextDouble();
            System.out.print("Enter you age :");
            age = scan.nextInt();

            System.out.print("please Chose Trip Type 1-One Way 2-Round Trip ");
            tripType = scan.nextInt();

            if (distance >0 && age >0 && (tripType==1 || tripType==2)){
                    System.out.println("Welcome to our line ");
            }else {
                    System.out.println("Your Data Is Wrong...");
            }


            normaltotal = distance * 0.10;
            switch (tripType){
                    case 1:
                            if(age<12){
                                    ageDiscont = normaltotal * 0.50;
                                    discont = normaltotal - ageDiscont;
                                    System.out.println("Total : " +discont + " TL");
                            }else if(age<24){
                                    ageDiscont = normaltotal * 0.10;
                                    discont = normaltotal - ageDiscont;
                                    System.out.println("Total : " +discont +" TL");
                            }else if (age>=65){
                                    ageDiscont = normaltotal * 0.30;
                                    discont = normaltotal - ageDiscont;
                                    System.out.println("Total : " +discont + " TL");
                            }else {
                                    System.out.println("Total : " +normaltotal + " TL");
                            }break;
                    case 2:
                            if(age<12){
                                    ageDiscont = normaltotal * 0.50;
                                    discont = normaltotal - ageDiscont;
                                    roundDiscont =discont* 0.20;
                                    totalDiscond = (discont - roundDiscont)*2;
                                    System.out.println("Total : " +totalDiscond + " TL");
                            }else if(age<24){
                                    ageDiscont = normaltotal * 0.10;
                                    discont = normaltotal - ageDiscont;
                                    roundDiscont =discont* 0.20;
                                    totalDiscond = (discont - roundDiscont)*2;
                                    System.out.println("Total : " +totalDiscond + " TL");
                            }else if (age>=65){
                                    ageDiscont = normaltotal * 0.30;
                                    discont = normaltotal - ageDiscont;
                                    roundDiscont =discont* 0.20;
                                    totalDiscond = (discont - roundDiscont)*2;
                                    System.out.println("Total : " +totalDiscond + " TL");
                            }else {
                                    discont = normaltotal *0.20;
                                    totalDiscond = (normaltotal - discont)*2;
                                    System.out.println("Total : " +totalDiscond + " TL");
                            }
            }
    }
}
