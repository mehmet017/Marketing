package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        // kullanicin verdigi sayi icin carpim tablosunu olusturup console a yazdiran kodu yaziniz
        Scanner input =new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek istediginiz sayiyi giriniz");
        int num=input.nextInt();
        int i=1;

        while (i<11){
            System.out.println(num+"*"+i+"="+(num*i));

            i++;
        }

        // verilen bir String de her harfin sonrasina yildiz sembolunu ekleyiniz
        System.out.println("Bir kelime giriniz...");
        String word=input.next();

        int k=0;
        String kelime="";

        while (k<word.length()){
            kelime=kelime+word.charAt(k)+'*';
            k++;
        }
        System.out.println(kelime);



    }
}
