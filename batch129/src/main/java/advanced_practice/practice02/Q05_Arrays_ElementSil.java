package advanced_practice.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {
    /*
     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Array Limitini giriniz");
        int limit=input.nextInt();
        int[] arr=new int[limit];

        for (int i=0;i<arr.length;i++){
            System.out.println("Index "+i+"degerini giriniz");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Silmek istediginiz karakterin index ini giriniz...");
        int remove=input.nextInt();
        int newArr[]=new int[limit-1];
        int idx=0;

        for (int i=0;i<arr.length;i++){
            if (i!=remove){
                newArr[idx]=arr[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(newArr));



    }
}
