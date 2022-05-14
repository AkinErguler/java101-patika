package patikaodev;

import java.util.Scanner;

public class RecursiveUsluSayiHesaplama {

    static int t = 1;

    public static int usAl(int taban, int us) {
        if (us == 0)
            return 1;
        t *= taban;
        usAl(taban, us - 1);
        return t;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("üssü alınacak sayıyı giriniz"+" " );
        int taban = inp.nextInt();
        System.out.print("üs değerini giriniz"+" " );
        int us = inp.nextInt();
        System.out.println("Sonuç:"+usAl(taban, us));
    }


}