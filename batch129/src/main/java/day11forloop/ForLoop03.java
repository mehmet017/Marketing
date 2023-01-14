package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
      String s ="Kahramanmaras";
        String t = "";
        for (int i=s.length()-1;i>=0;i--){
            t=t + s.charAt(i);



        }
        System.out.print(t);
        System.out.println();

        // palindrome olup olmadigini kontrol ediniz
        String r= "civic";
        String p="";
        for (int i=r.length()-1;i>=0;i--){
            p=p+r.charAt(i);
        }
        if (r.equals(p)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome degil");
        }



    }
}
