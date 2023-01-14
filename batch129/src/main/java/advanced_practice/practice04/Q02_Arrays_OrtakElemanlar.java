package advanced_practice.practice04;

import java.util.Arrays;

public class Q02_Arrays_OrtakElemanlar {
    public static void main(String[] args) {
     /*
     * İki Array'de ortak bulunan elementleri ayrı bir List içerisine ekleyen bir kod yazınız.
     * (case sensitivity olmadan)
     * Input1 :      String[] arr = {"John","Brad","Angel","Sofia","Emily"};
                     String[] brr = {"sofia","brad","grace","emily","hazel"};
     * Output : [brad,sofia,emily]
     */
        String[] arr = {"John","Brad","Angel","Sofia","Emily"};
        String[] brr = {"sofia","brad","grace","emily","hazel"};

        int counter=0;
        for (String w:arr){
            for (String k:brr){
                if (w.toLowerCase().equals(k)){
                  counter++;
                }
            }

        }
        String [] newArr=new String[counter];
        int idx=0;

        for (String w:arr){
            for (String k:brr){
                if (w.toLowerCase().equals(k)){
                 newArr[idx]=k;
                 idx++;
                }
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
