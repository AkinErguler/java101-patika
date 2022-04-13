package java101;

import java.util.Scanner;

public class DaireDilimAlanHesabi {
    public static void main(String[] args) {
        double aciDegeri,pi=3.14,yaricap,daireDilimAlani;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen daire dilim alanı hesaplanacak, merkez açısını giriniz ");
        aciDegeri=input.nextInt();
        System.out.println("Lütfen yarıçapı cm cinsinden giriniz. ");
        yaricap= input.nextDouble();
        daireDilimAlani=pi*(yaricap*yaricap)*aciDegeri/360;
        System.out.println("Daire Dilim Alanı: "+daireDilimAlani+"cm2");

    }
}
