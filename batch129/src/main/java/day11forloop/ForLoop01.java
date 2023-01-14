package day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {
        //verilen bir String de ilk 'a' harfinden onceki tum character leri console a yazdiriniz
       String s = "I love Java";

       for (int a=0;a<s.length();a++){
           char ch=s.charAt(a);
           if (ch=='a'){
               break;
           }
           System.out.print(ch);
       }


        System.out.println();
        // verilen bir String de 'a' dan sonraki tum character leri tersten yazdiriniz
        // Germany  ==> yn
        String t = "Germany";
        for (int i=t.length()-1;i>=0;i--){
            char tCh= t.charAt(i);
            if (tCh=='a'){
                break;
            }
            System.out.println(tCh);
        }




    }
}
