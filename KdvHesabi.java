package com.java101;

import java.util.Scanner;

public class KdvHesabi {
    public static void main(String[] args) {
        double volue,kdv,kdvliDeger,kdvoran=0.18;
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen hesaplanacak para değerini giriniz ");
        volue=input.nextDouble();
        kdv =(volue*kdvoran);
        kdvliDeger= volue+kdv;
        System.out.println("Girdiğiniz değer; "+volue+"TL");
        System.out.println("KDV DEĞERİ; "+kdv+"TL");
        System.out.println("KDV'Lİ DEĞER; "+kdvliDeger+"TL");
    }

}
