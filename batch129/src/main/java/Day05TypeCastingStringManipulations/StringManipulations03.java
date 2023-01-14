package Day05TypeCastingStringManipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        boolean first =pwd.length()>7;
        System.out.println(first);

        boolean second = !pwd.contains(" ");
        System.out.println(second);

        boolean third =pwd.replaceAll("[^A_Z]","").length()>0;
        System.out.println(third);
         boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);

        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);



    }
}
