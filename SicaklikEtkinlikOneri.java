package patikaodev;

import java.util.Scanner;

public class SicaklikEtkinlikOneri {
    public static void main(String[] args) {
        int head;
        String a = "Kayak", b = "Sinema", c = "Piknik", d = "Yüzme";
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık Değerini giriniz: ");
        head = inp.nextInt();
        if (head < 5) {
            System.out.println("Bugün kayak yapabilirsiniz ");
        }
        if (((head >= 5) && (head < 10)) ) {
            System.out.println("Bugün sinemaya gidebilirsiniz ");
        }
        if (head >=10 && head <= 15) {
            System.out.println("Bugün sinemaya gidebilir yada piknik  yapabilirsiniz ");
        }
        if ((head > 15) && (head <= 25)) {
            System.out.println("Bugün piknik yapabilirsiniz. ");
        }
        if (head >25) {
            System.out.println("Bugün yüzmeye gidebilirsiniz.");}


    }
}