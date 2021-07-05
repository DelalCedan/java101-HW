package com.company;

import java.util.Scanner;

public class vucutKitle {
    public static void main(String[] args) {
        int weight;
        double Height ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Weight in kg : ");
        weight = scanner.nextInt();

        System.out.print("Enter your Height  in m : ");
        Height  = scanner.nextDouble();

        double bMass = weight /(Height  * Height );
        System.out.println("Body Mass Index : " +bMass);

    }
}
