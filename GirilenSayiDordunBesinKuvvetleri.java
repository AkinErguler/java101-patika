package patikaodev;

import java.util.Scanner;

public class GirilenSayiDordunBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,four=1,five=1;
        System.out.println("Lütfen Sayıyı giriniz ");
        sayi = inp.nextInt();
        for (int i = 1;i <= sayi;i++){
            four*=4;
            five*=5;
            System.out.println(four );
            System.out.println((five));
           }


    }


}





