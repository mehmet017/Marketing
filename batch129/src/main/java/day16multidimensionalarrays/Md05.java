package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {
        //Example 1: Bir integer multi-dimensional array olusturunuz
        //Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz

        int a[][]={{7,9,12},{5,3,28}};
        int sum=1;

        for (int[]w:a){
            for (int k:w){
                sum*=k;
            }
        }
        System.out.println(sum);



    }
}
