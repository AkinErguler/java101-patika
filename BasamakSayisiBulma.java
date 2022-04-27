package patikaodev;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class BasamakSayisiBulma {
    public static void main(String[] args) {
        int sayi,basamakTop=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz ");
        sayi=inp.nextInt();
        while (sayi!=0){
        basamakTop+=sayi%10 ;
        sayi/=10;
        }
        System.out.println(basamakTop);
    }






    }


