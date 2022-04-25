package patikaodev;

import java.util.Scanner;

public class CiftVeDordunKatlariSayilarToplami {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner inp=new Scanner(System.in);
        do {
            System.out.println("Lütfen sayıyı giriniz ");
            sayi = inp.nextInt();
            if (sayi % 4 == 0 && sayi % 2 == 0) {
                toplam+=sayi ;
                System.out.println("Çift ve 4 ün katları olan sayılar toplamı "+toplam);
            }
        }while (sayi%2==0);

            }
        }



