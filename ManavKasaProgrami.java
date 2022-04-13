package com.java101;
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        //Değişkenler tanımlanıyor.
        double domatesFiyat = 1.11, armutFiyat = 2.14, elmaFiyat = 3.67, muzFiyat = 0.95, patlicanFiyat = 5,
                domTop, elmaTop, armutTop, muzTop, patlicanTop, domates, patlican, elma, armut, muz;
        //Alıcıdan satın alınacak meyve miktarları istenip ilgili değişkenlere atanıyor.
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç kilo domates aldınız ? ");
        domates = scan.nextDouble();
        System.out.print("Kaç kilo elma aldınız ? ");
        elma = scan.nextDouble();
        System.out.print("Kaç kilo armut aldınız ? ");
        armut = scan.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız ? ");
        patlican = scan.nextDouble();
        System.out.print("Kaç kilo muz aldınız ? ");
        //toplam tutarlar hesaplanıyor
        muz = scan.nextDouble();
        armutTop = armutFiyat * armut;
        elmaTop = elmaFiyat * elma;
        domTop = domatesFiyat * domates;
        muzTop = muzFiyat * muz;
        patlicanTop = patlican * patlicanFiyat;
        //sonuçlar yazdırılıyor
        System.out.println("1 kilo Armut fiyatı " + armutFiyat + " Toplam Tutar " + armutTop + "TL");
        System.out.println("1 kilo Elma Fiyatı " + elmaFiyat + " Toplam Tutar " + elmaTop + "TL");
        System.out.println("1 kilo Domates Fiyatı " + domatesFiyat + " Toplam Tutar " + domTop + "TL");
        System.out.println("1 kilo Muz Fiyatı " + muzFiyat + " Toplam Tutar " + muzTop + "TL");
        System.out.println("1 Kilo Patlıcan Fiyatı " + patlicanFiyat + " Toplam Tutar " + patlicanTop + "TL");
    }
}
