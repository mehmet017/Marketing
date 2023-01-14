package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //Example 1: Integer bir list olusturunuz
        // List'e 5 tane eleman ekleyiniz.
        // Bu elemanlardan 12'yi siliniz
        List<Integer> ages=new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);

        //Note: siz Java da tamsayi yazdiginizda Java o tamsayinin data type ini
        // otomatik olarak "primitive int" kabul eder. Bu yuzden remove() methodunun
        // icine yazdiginiz tamsayi eleman olarak degil index olarak kabul edilir.
        // Tamsayiyi eleman olarak gostermenin birkac yolu vardir.
        // 1.Yol
        Integer nonPrimitive=12;
        ages.remove(nonPrimitive);
        System.out.println(ages);
        ages.add(12);
        // 2.Yol Recommended
        ages.remove((Integer) 12);
        System.out.println(ages);
        ages.add(12);
        // 3.Yol
        ages.remove(Integer.valueOf(12));
        System.out.println(ages);
        ages.add(12);
        //4. Yol
        ages.remove(ages.indexOf(12));
        System.out.println(ages);

        //Example 2: Integer bir list olusturunuz
        // List'e 5 tane eleman ekleyiniz.
        // Bu elemanlardan tum 12'leri siliniz
        List<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        List<Integer> silinecekler=new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(25);
        //remove() method u List ile calisir.
        //remove() method u bir veya birden fazla elemanin tum gorunumlerini silmek icin kullanilir.
        nums.removeAll(silinecekler);
        System.out.println(nums);


    }
}
