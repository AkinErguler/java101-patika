package patikaodev;

import java.util.Scanner;

public class ObebOkek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("n1 sayısını giriniz: ");
        int n1=input.nextInt();

        System.out.println("n2 sayısını giriniz: ");
        int n2=input.nextInt();

        //küçğkten büyüğe dopru
        int ebob=1;
        for(int i=1;i<=n1;i++) {

            if(n1%i==0 && n2%i==0) {
                ebob=i;
            }
        }
        System.out.println(ebob);

        //büyükten küçüğe dopru
        for(int k=n1;k>=1;k--) {
            if(n1%k==0 && n2%k==0) {
                ebob=k;
                break;
            }
        }

        for(int i=1;i<=(n1*n2);i++) {

            if(i%n1==0 && i%n2==0) {
                System.out.println(i);
                break;
            }
        }
        //formül ile
        System.out.println((n1*n2)/ebob);

    }

    }

