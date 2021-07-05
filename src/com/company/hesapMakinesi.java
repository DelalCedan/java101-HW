package com.company;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        double n1 , n2 ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number : ");
        n1 = scanner.nextDouble();
        System.out.print("Enter your second number : ");
        n2= scanner.nextDouble();

        System.out.println(" 1-sum \n 2-sub \n 3-Multiply \n 4-divide");
        System.out.println("select your operation : " );
        int select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Total = " + (n1+n2));
                break;
            case 2:
                System.out.println("Subtract = " +(n1-n2));
                break;
            case 3:
                System.out.println("Multiply = " +(n1*n2));
                break;
            case 4:
                if(n2!=0) {
                    System.out.println("Divide = " + (n1 / n2));
                }else {
                    System.out.println("A number is not divisible by Zero");
                }
                break;
            default:
                System.out.println("Wrong Choice");
        }

    }
}
