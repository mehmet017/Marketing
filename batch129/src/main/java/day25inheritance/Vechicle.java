package day25inheritance;

public class Vechicle {

    /*
    1)Child Class'tan bir Object olusturdugunuzda constructor'lar
    en ustteki parent class'tan baslatilarak alta dogru calistirilir
    2) Child Class'taki constructordan Parent Class'taki constructor'a gidebilmek icin "super()" kullanilir.
    3) Parent Class'ta birde fazla constructor varsa istenilen constructor, super() ifadesinin parentezi icine yazilan
    parametreler yardimi ile secilebilir
    4) Ayni Class icindeki constructor'lari secmek icin this() kullanilir.
    Ayni Class'ta birde fazla constructor varsa istenilen constructor, this() ifadesinin parentezi icine yazilan
    parametreler yardimi ile secilebilir
    5)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir
       Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
    6)super() ve this() ifadeleri constructor icinde her zaman ayni satirda olmak zorundadir.
    7)Bir constructor icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bakiniz 6. kural...
    8)Inheritance da variablelari ve methodlaricagirmak icin "this" veya "super" kullanilir.
     */
    public int price=12000;
    public void engine(){
        System.out.println("Vehicle engine");
    }
    public Vechicle(){
        System.out.println("Vehicle 1");
    }

    public Vechicle(int price){
        System.out.println("Vehicle 2: "+price);
    }
}
