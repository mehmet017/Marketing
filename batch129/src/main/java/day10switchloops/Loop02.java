package day10switchloops;

public class Loop02 {
    public static void main(String[] args) {
        //Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz

        for (int a=21;a<181;a++){
            if (a%4==0&&a%6==0){
                System.out.println(a);
            }
        }

        // Size verilen kucuk harfle yazilmis String in index i cift sayi olan character lerini buyuk harf yapiniz

        String s= "ankara";

      for (int i=0;i<s.length();i++){
          String ch=s.substring(i,i+1);
          if (i%2==0){
              System.out.println(ch.toUpperCase());
          }



      }

    }
}
