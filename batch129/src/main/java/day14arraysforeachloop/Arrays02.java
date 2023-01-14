package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 2: Integer array olusturunuz icine 6 tane eleman yerlestiriniz,
        //bu elemanlarin en kucugu ile en buyugunu ekrana yazdiriniz

        int ages[]=new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

       /* System.out.println(Arrays.toString(ages));//[12, 23, 19, 44, 15, 32]
        // sort metodu array deki elemanlari kucukten buyuge dizer

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);//59            */

        //2. Yol:

        int minunmum =ages[0];
        int maximum=ages[0];

        for (int w: ages){
            minunmum=Math.min(minunmum,w);
            maximum=Math.max(maximum,w);
        }

        System.out.println(maximum+minunmum);


    }
}
