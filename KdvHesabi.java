package com.java101;

import java.util.Scanner;

public class KdvHesabi {
    public static void main(String[] args) {
        double newVolue,volue,kdv,kdvliDeger,kdvoran1=0.18,kdvoran2=0.8;
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen hesaplanacak para değerini giriniz ");
        volue=input.nextDouble();
        newvolue=(volue>0||(volue<1000)? kdvoran1:kdvoran2)
        kdv =(volue*newvolue);
        kdvliDeger= volue+kdv;
        System.out.println("Girdiğiniz değer; "+volue+"TL");
        System.out.println("KDV DEĞERİ; "+kdv+"TL");
        System.out.println("KDV'Lİ DEĞER; "+kdvliDeger+"TL");
    }

}
