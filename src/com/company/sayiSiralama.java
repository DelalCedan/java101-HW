package com.company;

import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number : ");
        a = scan.nextInt();
        System.out.print("Enter second number : ");
        b = scan.nextInt();
        System.out.print("Enter third number : ");
        c = scan.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print(a + "<" + b + "<" + c);
            } else {
                System.out.println(a + "<" + c + "<" + b);
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println(b + "<" + a + "<" + c);
            } else {
                System.out.println(b + "<" + c + " <" + a);
            }
        } else  {
            if (a < b)
                System.out.println(c + "<" + a + "<" + b);
            else {
                System.out.println(c + "<" + b + "<" + a);
            }
        }
    }
}
