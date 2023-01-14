package advanced_practice.practice06;

public class Q04_MethodOverloading_Hacim {

    public static void main(String[] args) {
        Hacim object=new Hacim();
        int kupHacim=object.hacimHesapla(5);
        System.out.println("kupHacim = " + kupHacim);
        int karePrizmaHacim= object.hacimHesapla(5,4);
        System.out.println("karePrizmaHacim = " + karePrizmaHacim);
        int dikdortgenPrizmaHacim= object.hacimHesapla(2,3,4);
        System.out.println("dikdortgenPrizmaHacim = " + dikdortgenPrizmaHacim);
    }
}
