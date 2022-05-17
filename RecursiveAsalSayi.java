package patikaodev;

import java.util.Scanner;

public class RecursiveAsalSayi {
    static boolean isAsal(int sayi) {
        int counter = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi / i == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }
        public static void main (String[]args){
            Scanner inp = new Scanner(System.in);
            System.out.println(" lütfen sayıyı giriniz");
            int sayi = inp.nextInt();

            if (isAsal(sayi) == true) {
                System.out.println("Sayı Asaldır");
            } else {
                System.out.println("Sayı asal değildir.");
            }
        }



}




