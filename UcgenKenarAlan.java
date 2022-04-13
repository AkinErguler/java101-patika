package java1101;

import java.util.Scanner;

public class UcgenKenarAlan {
    public static void main(String[] args) {
        double kenar1,kenar2,kenar3,u,v,alan;
        Scanner sc=new Scanner(System.in);
        System.out.print("üçgenin 1. kenarını cm olarak giriniz ");
        kenar1= sc.nextDouble();
        System.out.print("üçgenin 2. kenarını cm olarak giriniz ");
        kenar2= sc.nextDouble();
        System.out.print("üçgenin 3. kenarını cm olarak giriniz ");
        kenar3= sc.nextDouble();
        u=(kenar1+kenar2+kenar3)/2;
        v= u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        alan=Math.sqrt(v);
        System.out.println("Üçgenin alanı: "+alan+" cm2");



    }
}
