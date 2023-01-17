package advanced_practice.practice09;

import java.util.Scanner;

public class Q03_ForLoop_RakamlarToplami {
    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("String bir ifade giriniz...");
        String str= input.nextLine();

        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
           if (Character.isDigit(str.charAt(i))){
               sum+=Integer.parseInt(str.substring(i,i+1));
           }
        }
        System.out.println("sum = " + sum);
    }
}
