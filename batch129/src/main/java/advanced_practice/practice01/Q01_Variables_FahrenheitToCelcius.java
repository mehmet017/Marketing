package advanced_practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variables_FahrenheitToCelcius {
    //Fahrenheit degeri, Celsius degere ceviren kod yaziniz
    //formül:c =(f-32)*5/9
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz...");
        double f=input.nextDouble();

        double c=(f-32)*5/9;
        System.out.println("Celcius: "+c+" C");
        //Ondalik kismi belirli bir formata dönüstürmek icin
        //1. Yol: DecimalFormat class

        DecimalFormat decimalFormat=new DecimalFormat("0.00");
        String formattedCelcius=decimalFormat.format(c);
        System.out.println("formattedCelcius = " + formattedCelcius);

        //2. yol : Printf ile ;

        System.out.printf("%.2f",c); //%=> herhangi bir sayi, 2f=> iki basamakli format





    }
}
