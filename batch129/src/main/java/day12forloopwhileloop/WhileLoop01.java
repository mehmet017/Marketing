package day12forloopwhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        // 3 ten 10 a kadar tamsayilari console yazdiriniz
        for (int i=3;i<11 ;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        // 2. yol: While-Loop
        int i=3;

        while (i<11){
            System.out.print(i+" ");

            i++;
        }
        System.out.println();

        // 23 ten 12 ye kadar cift tamsayilar console a yazdiriniz

        int k=23;
         while (k>11){
             if (k%2==0){
                 System.out.print(k+" ");
             }
            k--;
         }
        System.out.println();
        // Verilen bir tamsayinin rakamlari toplamini console a yazdiran kodu yaziniz
        // 1. Yol While-Loop
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int num=input.nextInt();
        num=Math.abs(num);
        int sum=0;

        while (num>0){

            sum=sum+num%10;


            num/=10;
        }
        System.out.println(sum);


        // 2. Yol For-Loop

        int a= 6841;

        int toplam= 0;

        for (int m=a;m>0;m/=10){
            toplam=toplam+m%10;
        }
        System.out.println(toplam);















    }
}
