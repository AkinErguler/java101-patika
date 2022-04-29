package patikaodev;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi,temp=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz ");
        sayi=inp.nextInt();
        for (int i=1;i<sayi;i++) {
            if (sayi%i == 0) {
                temp += i;
            }
        }
        if (temp==sayi){
            System.out.println(sayi +" Mükemel sayıdır.");
        }else
        {
            System.out.println(sayi +" Mükemmel sayı değildir.");
            }
    }
    }

