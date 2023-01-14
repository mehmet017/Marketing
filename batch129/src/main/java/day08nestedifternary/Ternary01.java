package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        if (a<b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

        double result =a<b ? a : b;
        System.out.println(result);


    }
}
