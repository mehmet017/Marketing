package advanced_practice.practice04;

public class Q01_Arrays_OrtalamandanBuyuk {
    public static void main(String[] args) {
        //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.
        int[] arr = {5, 9, 15, 1, 0, 11, 3};
        int total=0;

        for (int w:arr){
            total+=w;
        }
        int ave=total/arr.length;
        for (int w:arr){
            if (w>ave){
                System.out.print(w+" ");
            }
        }
    }
}
