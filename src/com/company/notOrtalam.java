package com.company;

import java.util.Scanner;

//Not Ortalaması Hesaplayan Program

public class notOrtalam {

    public static void main(String[] args) {

        double math, fizik , ph , kimya , turkce;
        Scanner Number = new Scanner(System.in);

        System.out.print("öğrencinin adını yazınız :");
        String name = Number.nextLine();

        System.out.print("math notu = ");
        math = Number.nextDouble();

        System.out.print("fizik notu = ");
        fizik = Number.nextInt();

        System.out.print("ph notu = ");
        ph = Number.nextInt();

        System.out.print("kimya notu = ");
        kimya = Number.nextInt();

        System.out.print("turkce notu = ");
        turkce = Number.nextInt();

        double sum = math + fizik + ph + kimya + turkce;
        double averge = sum/5;
        System.out.println(name + " ortalama notu : " +averge );

        boolean kosul = averge>=60 ;

        String str = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);

    }
}
