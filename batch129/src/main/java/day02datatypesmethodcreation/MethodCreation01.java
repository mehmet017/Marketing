package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {
       int sonuc = add(3,5);
        System.out.println(sonuc);
        long carpmasonucu =multiply(3, 6);
        System.out.println(carpmasonucu);

       long karma= carptopla(4,7,8);
        System.out.println(karma);

        double kup = cube(5.2);
        System.out.println(kup);
    }
    public static int add(int a, int b){
    return a+b;
    }
    protected static long multiply(int a, int b){
        return a*b;
    }
    public static long carptopla(int a, int b, int c){
        return (a*b)+c;
    }
    public static double cube(double a){
        return a*a*a;
    }
//1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
//2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
//3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
//4)Dairenin alaninio hesaplayan methodu olusturunuz ve kullaniniz
}