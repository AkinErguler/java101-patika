package patikaodev;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        int ust,Faktoriyel=1;
        Scanner inp= new Scanner(System.in);
        System.out.print("Faktoriyeli hesaplanacak sayıyı giriniz ");
        ust=inp.nextInt();
        for (int i=ust;i>=1;--i){
            Faktoriyel*=i;
                    }
        System.out.println("Faktoriyel Değeri= "+Faktoriyel);





    }
}
