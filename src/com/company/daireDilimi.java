package com.company;

import java.util.Scanner;

public class daireDilimi {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Diameter : ");
        r = scanner.nextInt();

        System.out.print("Enter Your Central Angle");
        a = scanner.nextInt();

        double AreaSegment = (pi *( r * r )* a)/360;

        System.out.println("Area Of a Segment = " +AreaSegment);

    }
}
