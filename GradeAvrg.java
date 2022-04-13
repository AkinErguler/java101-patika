package com.java101;

import java.util.Scanner;

public class GradeAvrg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Kullanıcıdan int not değeri alabilmek için Scanner sınıfını kullandık
        System.out.print("Lütfen Matematik sınav sonucunuzu giriniz ");
        int mathGrade = input.nextInt();
        System.out.print("Lütfen Fizik sınav sonucunuzu giriniz ");
        int physicGrade = input.nextInt();
        System.out.print("Lütfen Kİmya sınav sonucunuzu giriniz ");
        int ChamGrade = input.nextInt();
        System.out.print("Lütfen Türkçe  sınav sonucunuzu giriniz ");
        int turkceGrade = input.nextInt();
        System.out.print("Lütfen Tarih sınav sonucunuzu giriniz ");
        int historyGrade = input.nextInt();
        System.out.print("Lütfen Müzik sınav sonucunuzu giriniz ");
        int musicGrade = input.nextInt();
        //not ortalaması hesaplanıyor
        int gradeAvarage = ((mathGrade + physicGrade + ChamGrade + turkceGrade + historyGrade + musicGrade) / 6);
        System.out.println("Not ortalamız; " + gradeAvarage);
        //60 not koşulu uygulanıyor
        String str = gradeAvarage >= 60 ? "Tebrikler Geçtiniz" : "Maalesef Kaldınız";
        System.out.println(str);
    }
}