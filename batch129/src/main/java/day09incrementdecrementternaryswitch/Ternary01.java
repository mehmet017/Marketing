package day09incrementdecrementternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        int a= 10;
        int b= 20;

        int r1 =a<7 ? a++ : b++;
        System.out.println(r1);

        System.out.println(a);

        System.out.println(b);

        //Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz

        int c= -4;

        int r2=c<0 ? -1*c : c;
        System.out.println(r2);


        // iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.
        int m= 5;
        int n= 6;

        Object r3 = (m>0 &&n>0) || (m<0 &&n<0)  ? m*n : "Farkli isaretli sayilari carpamiyorum";
        System.out.println("r3 degeri: "+r3);


        // size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int k = input.nextInt();
        int k3=Math.abs(k);

        String k1=(k3>99&&k3<1000) ? k + " Sayimiz 3 basamakli bir sayidir..." : k + " Sayimiz 3 basamakli bir sayi degildir...";
        System.out.println(k1);
    }
}
