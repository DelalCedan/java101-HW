package com.company;

import java.util.Scanner;

public class ucgeninAlani {
    public static void main(String[] args) {
        double a , b ,c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter first side : ");
        a = scanner.nextInt();
        System.out.print("enter second side : ");
        b = scanner.nextInt();
        System.out.print("enter third side : " );
        c = scanner.nextInt();
        //ücgenin çevresi
        double u = ((a + b + c)/2);

        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;
        System.out.println(" alan= " +alan);

    }
}
