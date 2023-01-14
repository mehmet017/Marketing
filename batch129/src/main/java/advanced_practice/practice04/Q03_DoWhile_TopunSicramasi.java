package advanced_practice.practice04;

import java.util.Scanner;

public class Q03_DoWhile_TopunSicramasi {
    /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Topun Yuksekligini giriniz...");
        double ballHeight=input.nextInt();
        double  distance=0;
        int counter=0;

        do {
            counter++;
            distance+=ballHeight;
           ballHeight=ballHeight*0.75;
           distance+=ballHeight;
        }while (ballHeight>1);
        System.out.println("Toplam sicrama sayisi "+counter);
        System.out.printf("toplam yol = "+"%.2f",distance);




    }

}
