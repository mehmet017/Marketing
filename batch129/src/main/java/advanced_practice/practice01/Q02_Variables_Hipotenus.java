package advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Variables_Hipotenus {
    public static void main(String[] args) {
        //Hipotenus hesaplayan bir kod yaziniz.
        //  c*c=a*a+b*b
        Scanner input= new Scanner(System.in);
        System.out.printf("1. dik kenar uzunlugunu giriniz: ");
        double a=input.nextDouble();
        System.out.printf("2. dik kenar uzunlugunu giriniz: ");
        double b=input.nextDouble();

        double c=Math.sqrt(a*a+b*b);
        System.out.printf("Hipotenus: "+c);
        System.out.println();
        System.out.printf("%.2f",c);





    }
}
