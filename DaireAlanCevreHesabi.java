package patikaodev;

import java.util.Scanner;

public class DaireAlanCevreHesabi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double pi=3.14,yaricap,cevre,alan;
        System.out.println("Yarıçapı cm cinsinden giriniz ");
        yaricap= scan.nextDouble();
        alan=(pi*yaricap*yaricap);
        cevre=(2*pi*yaricap);
        System.out.println("Dairenin çevresi "+cevre+ " cm");
        System.out.println("Dairenin alanı "+ alan+ " cm2");
    }





}
