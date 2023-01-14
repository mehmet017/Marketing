package advanced_practice.practice02;

import java.util.Arrays;

public class Q03_Arrays_IkinciMax {
        /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787
       */


    public static void main(String[] args) {
        //1.yol
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-90, 0, 1, 100, 845, 898, 8787, 10001]
        System.out.println("min: "+arr[0]+" max: "+arr[arr.length-1]+" secMax: "+arr[arr.length-2]);

        //2.yol
        int arrMax=arr[0];
        int arrMin=arr[0];
        int arrSecMax=arr[0];

        for (int w:arr) {
           if (w<arrMin){
               arrMin=w;
           } else if (w>arrMax) {
               arrSecMax=arrMax;
               arrMax=w;
           } else if (w>arrSecMax) {
               arrSecMax=w;
           }
            System.out.println("min: "+arrMin+" max: "+arrMax+" secMax: "+arrSecMax);

        }








    }
}
