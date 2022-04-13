package com.java101;
import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        double km, perKm = 2.20, total, firstPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen mesafeyi km cinsinden giriniz. ");
        km = input.nextDouble();
        total = km * perKm;
        total += firstPrice;
        total = total < 20 ? 20 : total;
        System.out.println("Taksimetre ücreti " + total + "TL dir.");

    }
}