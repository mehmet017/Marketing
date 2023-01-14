package advanced_practice.practice01;

import java.util.Scanner;

public class Q03_Ternary_NoteSystem {
    /*
   Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.(Ternary kullanınız)
   (90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Diğerleri F)
    */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        int not=input.nextInt();

        String harfNot=
                not>100? "0 ile 100 arasi bir not giriniz": not>89?
                        "A":not>79?
                        "B":not>69?
                        "C":not>59?
                        "D":not>49?
                        "E":not>-1?
                         "F":"0 ile 100 arasi bir not giriniz";
        System.out.println(harfNot);




    }
}
