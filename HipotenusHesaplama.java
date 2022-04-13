package com.java101;

import java.util.Scanner;

        public class HipotenusHesaplama {
            public static void main(String[] args) {
                double a,b,c;
                Scanner input=new Scanner(System.in);
                System.out.print("Birinci dik kenarı giriniz ");
                a=input.nextDouble();
                System.out.print("ikinci  dik kenarı giriniz ");
                b=input.nextDouble();
                c=Math.sqrt(a*a+b*b);
                System.out.println("Hipotenüs değeri ="+c);

            }

}
