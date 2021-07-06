package com.company;

import java.util.Scanner;

public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        int math, physics, turkish ,chemistry, music;

        Scanner scan = new Scanner(System.in);

        System.out.print("Math Point :");
        math = scan.nextInt();
        while (math<0 || math>100){
            System.out.println("ERROR: Enter it again");
            math = scan.nextInt();
        }

        System.out.print("Physics Point :");
        physics = scan.nextInt();
        while (physics <0 || physics >100){
            System.out.println("ERROR: Enter it again ");
            physics = scan.nextInt();
        }

        System.out.print("Turkish Point :");
        turkish = scan.nextInt();
        while (turkish <0 || turkish >100){
            System.out.println("ERROR: Enter it again ");
            turkish = scan.nextInt();
        }

        System.out.print("Chemistry Point :");
        chemistry = scan.nextInt();
        while ( chemistry < 0 || chemistry >100){
            System.out.println("ERROR: Enter it again ");
            chemistry = scan.nextInt();
        }

        System.out.print("Music Point :");
        music = scan.nextInt();
        while (music <0 || music >100){
            System.out.println("ERROR: Enter it again ");
            music = scan.nextInt();
        }

        double average  = (math + physics + turkish + chemistry + music)/5 ;

        if(average >=55){
            System.out.println("Congratulations You passed the class");
        }else {
            System.out.println("You failed the class");
        }

        System.out.println("Your average is " +average);

    }
}
