package advanced_practice.practice01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {
    /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisminiz giriniz");
        // "\\s" bir bosluk "\\s+" bir veya birden fazla bosluk anlamina gelir.
        String adSoyad=input.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);


        String ad=adSoyad.split(" ")[0];
        String soyad=adSoyad.split(" ")[1];

        String adIlk=ad.substring(0,1).toUpperCase();
        String soyadIlk=soyad.substring(0,1).toUpperCase();

        String adFormat= adIlk+ad.substring(1);
        String soyadFormat= soyadIlk+soyad.substring(1);

        System.out.println("adFormat = " + adFormat);
        System.out.println("soyadFormat = " + soyadFormat);


    }


}
