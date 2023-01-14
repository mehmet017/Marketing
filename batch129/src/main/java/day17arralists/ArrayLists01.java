package day17arralists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {
        //1)ArrayList ler coklu data depolamak icin kullanilir
        //2)ArrayList ler non-primitive data type indeki coklu depolamak icin kullanilir
        //  Listler "non-primitive"  data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder
        //3)ArrayList leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur
        // List ler eleman sayisinda "flexible" dirlar ama "Array" ler "flexible" degildirler
        //4) Madem "Array" ler eleman sayisinda flexible degil nicin java "Array" leri iptal etmedi?
        // i)Eleman sayisi belli olan data lari depolamak icin Array ler tercih edilir.
        // ii) Array ler cok hizli calisir
        // iii) Array ler memory de cok az yer kaplar

        // List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);// []

        //List lere eleman nasil eklenir?
        //List e eleman eklemek icin add() metodu kullaniriz ve
        //add() metodu her zaman elemani en sona ekler. (insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);

        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);
        System.out.println(ages);

        //List e coklu eleman nasil eklenir?
        //Bir List e coklu eleman eklemek icin o elemanlari once bir List in icine koymalisiniz

        ArrayList<Integer> newAges= new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);

        //Bir List teki tum elemanlari nasil silebilirim?
        // ages.clear();
        //System.out.println(ages);//[]

        //Bir elemanin List te var olup olmadigi nasil kontrol edere?
        boolean r=ages.contains(656);
        System.out.println(r);

        //Bir List in baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki List in esit olabilmesi icin ayni index te ayni elemanlari olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s= names1.equals(names2);
         //Example 1 : Verilen iki Integer List te tamamiyle ayni elemanlarin olup olmadigini
        //             kontrol eden kodu yaziniz.
        ArrayList<Integer> nums1= new ArrayList<>();
        nums1.add(10);
        nums1.add(9);
        nums1.add(8);

        ArrayList<Integer> nums2= new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);

        Collections.sort(nums2);

        boolean t=nums1.equals(nums2);
        System.out.println(t);



    }
}
