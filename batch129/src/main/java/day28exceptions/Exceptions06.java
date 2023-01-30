package day28exceptions;

public class Exceptions06 {

    public static void main(String[] args) {

        String s ="Java";
        getNumberOfChars(s);

        String t="";
        getNumberOfChars(t);

        String u = null;
        getNumberOfChars(u);//
    }

    //
    public static void getNumberOfChars(String s){

        int numOfChars = s.length();
        System.out.println(numOfChars);

    }

}
