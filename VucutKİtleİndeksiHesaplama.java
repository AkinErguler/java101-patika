package com.java101;

import java.util.Scanner;

public class VucutKİtleİndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo, vke;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz; ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();
        vke = (kilo / (boy * boy));
        System.out.print("Vücut kitle indeksiniz: " + vke);
    }
}
