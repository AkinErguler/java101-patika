package patikaodev;

import java.util.Scanner;

public class HarmonikSayileriBulma {
    public static void main(String[] args) {
    int n;
    double total = 0;
    Scanner inp = new Scanner(System.in);
    System.out.print("n değerini giriniz ");
    n = inp.nextInt();
        for (int i = 1; i <= n ; i++) {
        total += (1.0/i); //bu kısım double olmalı
    }
        System.out.println(total);
    }
}
