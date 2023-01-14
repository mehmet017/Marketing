package day14arraysforeachloop;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        //Example1: String Array olusturun icine 5 tane eleman ekleyi sonrada ilk eleman ile son elemani
        // icerdigi karakter sayilarini ekrana yazdirin
        String arr[]=new String[5];

        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length()+arr[arr.length-1].length());

        //Example1: String Array olusturun icine 5 tane eleman ekleyin,
        //tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin
        String brr[]=new String[5];

        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Frankfurt";
        brr[3]="Dhaka";
        brr[4]="Athena";
        //1. Yol
        int totalChar=0;

        for (int i=0;i<brr.length;i++){
        totalChar=totalChar+ brr[i].length();
        }

        System.out.println(totalChar);

        //2.Yol for-each loop(enhanced loop) ==> baslangic degeri, loop un calisma sarti ve increment/decrement kendisi halleder
        // for-eah loop "Array" lerde ve "Collection" larda kullanilabilir.
        // Index kullanmamiz gerektiginde bazen for-each loop caresiz kalir mecburen diger looplari kullaniriz

        int sum=0;

        for (String w: brr){
            sum =sum+w.length();
        }

        System.out.println(sum);




    }
}
