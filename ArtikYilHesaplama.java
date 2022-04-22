package patika101;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year ;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen yılı giriniz ");
        year=inp.nextInt();
        if(year%400==0||(year%100!=0&&year%4==0)){
            System.out.println(year +" artık yıldır.");}
            else{
                System.out.println(year +"artık yıl değildir.");}

    }
}
