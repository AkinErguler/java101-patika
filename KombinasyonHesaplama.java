package patikaodev;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        //Kombinasyon Hesapalama Formulü
        //C(n,r) = n! / (r! * (n-r)!)
        int n, r, m, fakt1 = 1, fakt2 = 1, fakt3 = 1;
        double kombinasyon;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kombinasyon hesabı için n değerini giriniz  ");
        n = inp.nextInt();
        System.out.print("Kombinasyon hesabı için r değerini giriniz ");
        r = inp.nextInt();
        if ((n > r) && (n != 0)) {
            m = n - r;
            for (int i = 1; i <= n; i++) {
                fakt1 *= i;
            }
            for (int j = 1; j <= r; j++) {
                fakt2 *= j;
            }
            for (int k = 1; k <= m; k++) {
                fakt3 *= k;
            }
            kombinasyon = fakt1 / (fakt2 * fakt3);
            System.out.println("kombinasyon "+kombinasyon);
        } else {
            System.out.println("n sayısı r den küçük yada eşit olamaz");


        }
    }
}





