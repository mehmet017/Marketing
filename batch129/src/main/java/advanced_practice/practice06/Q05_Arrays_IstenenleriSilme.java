package advanced_practice.practice06;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_IstenenleriSilme {
    //Bir Integer Array de verilen bir deger disindaki elemanlar yeni bir Array olarak yazdiran bir method yaziniz

    public static void main(String[] args) {
        int [] arr={1,2,2,8,6,3,1,9,5,7,4};

        System.out.println(Arrays.toString(arraySil(arr)));
    }

    public static int[] arraySil(int[] arr){
        System.out.println(Arrays.toString(arr));
        System.out.println("Silmek istediginiz elemani giriniz");
        Scanner input=new Scanner(System.in);
        int b=input.nextInt();
        int counter=0;
        for (int w:arr){
            if (w!=b){
                counter++;
            }
        }
        int idx=0;
        int [] brr=new int[counter];
        for (int w:arr){
            if (w!=b){
            brr[idx]=w;
            idx++;
            }
        }


        return brr;
    }
}
