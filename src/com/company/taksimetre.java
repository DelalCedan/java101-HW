package com.company;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double perkm=2.20 , total=10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in km : " );
        km = scanner.nextInt();

        total += (km * perkm);
        total = (total < 20) ? 20 : total;

        System.out.print("Total price : " +total +" TL");
    }
}
