package patikaodev;

import java.util.Scanner;

public class UceVeDordeBolunebilenSayiOrtalamaToplami {
    public static void main(String[] args) {
        int number, J = 0, toplam = 0;
        double ortalama = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Sayıyı giriniz. ");
        number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                J = J + 1;
                toplam += i;
                ortalama = toplam / J;
            }
        }
        System.out.println("Girilen Sayılardan 3 ve 4' bölünebilenlerin ortalaması " + ortalama);
    }
}