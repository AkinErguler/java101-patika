package patikaodev;

import java.util.Scanner;

public class PalindromNumbers {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber = 0;
        while (temp != 0) {
            lastNumber = number % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
        if (number == reverseNumber) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
    System.out.println(isPalindrom(45689));

    }
}
