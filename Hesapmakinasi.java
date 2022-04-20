package patikaodev;

import java.util.Scanner;

public class Hesapmakinasi {
    public static void main(String[] args) {
        int a, b, c;
        double scor;
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen İlk Sayıyı giriniz ");
        a = scan.nextInt();
        System.out.print("lütfen İkinci Sayıyı giriniz ");
        b = scan.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-ÇArpma\n4-Bölme");
        System.out.println("Lütfen yapılacak işlemi seçiniz");
        c = scan.nextInt();
        switch (c){
            case 1:
                scor = a + b;
                System.out.print("a+b= " + scor);
                break;
            case 2:
                scor = a - b;
                System.out.print("a-b= " + scor);
                break;
            case 3:
                scor = a * b;
                System.out.print("a*b= "+scor);
            case 4:
                if(b==0) {
                    System.out.println("Sayı sıfır ile bölünemez");
                    break;
                    }
                else
                    scor=a/b;
                    System.out.print("a/b= "+ scor);
                break;
            default :
                System.out.println("Yanlış seçim rakamı girdiniz");
                System.out.println("Tekrar deneyiniz");



        }
    }
}