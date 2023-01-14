package day03scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz



        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz...");

        int number = input.nextInt();


        int lastDigit = number%10;
        number=number/10;

        int lastseconddigit= number%10;
        number=number/10;

        int lastThirdDigit= number%10;
        number=number/10;

        int lastFourdDigit= number%10;
        number=number/10;

        int lastFifdDigit= number%10;

        System.out.println(lastDigit+lastseconddigit+lastFourdDigit+lastFifdDigit);



    }
}
