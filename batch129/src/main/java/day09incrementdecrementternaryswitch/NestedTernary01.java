package day09incrementdecrementternaryswitch;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
            Example 1: Verilen yilin "Artik Yil" (Leap Year) olup olmadigini kontrol eden kodu yaziniz
           1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600 ==> Leap  1800 ==> Leap Degil
           2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004 ==> Leap  2004 ==> Leap Degil

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int nesTer = input.nextInt();

        String kk=(nesTer%100==0) ? ((nesTer%400==0) ? "Leap Year": "Not Leap Year") :((nesTer%4==0) ? "Leap Year" : "Not Leap Year");
        System.out.println(kk);



    }
}
