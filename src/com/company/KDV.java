package com.company;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double kdvOran=0.18 , kdvTutar , kdvliTutar;
        Scanner scanner = new Scanner(System.in);

        System.out.print("ucret Tutarini giriniz :");
         double tutar= scanner.nextDouble();

        kdvTutar = kdvOran * tutar;
        kdvliTutar = kdvTutar + tutar;
        System.out.print("KDV'siz Tutur :" +tutar);
        System.out.print("KDV orani :" +kdvOran);
        System.out.print("KDV Tutari :" +kdvTutar);
        System.out.print("KDV'li Tutar :" +kdvliTutar);
    }
}
