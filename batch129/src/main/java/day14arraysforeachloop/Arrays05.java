package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Note1: sort() method u sayisal data type lerini kucukten buyuge siralar(ascending order)
        //Note2: sort() method u String data type lerini alfabetik olarak siralar(alphabetical order)
        //Note 3: ascending order + alphabetical order ==> Natural Order
        //Note 4: sort() method'u array elemanlarini "Natural Order" a gore siralar.

        //Note 5: binarySearch() method'u bir elemanin bir array'de olup olmadigini kontrol etmek icin kullanilir.
        //binarySearch() method'unu kullanmadan once "sort()" method'unu kullanmak zorundayiz
        //sort() method'unu kullanmazsaniz buldugunuz sonuc guvenilir olmaz.

        String [] colors= new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
        int num=Arrays.binarySearch(colors,"Blue");
        System.out.println(num);

        int num1=Arrays.binarySearch(colors,"Orange");
        System.out.println(num1);
    }
}
