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
    8)Inheritance da variablelları ve methodları çağırmak için "this" veya "super" kullanılır
  "this" aynı class içindeki variablelları ve methodları çağırmak için kulanılır
  "super" parent class içindeki variablelları ve methodları çağırmak için kulanılır
    9)  Method cagirirken constructora bakilir.
    Methodu'i ararken belirtilen constructordan aramaya baslayip bulanan kadar super'a dogru gideriz.
    10) Variable cagirirken data type'a bakilir.
    Variable'i ararken data typedaki classtan aramaya baslayip bulanan kadar super'a dogru gideriz.
    11) Inheritance'da Object kullanarak variable cagirirsanizi, Object'in data tipini temsil eden class'dan variable'i
    aramaya baslayiniz. O class da yoksa parent'lara bakiniz
    12) Inheritace'da Object kullanarak method cagirirsaniz Object'in constructor'ini temsil eden class'dan methodu aramaya baslayiniz
    o class'da yoksa parent'lara bakiniz.
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
