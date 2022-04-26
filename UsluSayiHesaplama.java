package patikaodev;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int sayi=1,us,sonuc=1;
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayıyı giriniz ");
        sayi=inp.nextInt();
        System.out.println("Hesaplanacak üs sayısını gir");
        us=inp.nextInt();
        for (int i=1;i<=us;i++){
        sonuc*=sayi;}
        System.out.println(sonuc);

    }
}
