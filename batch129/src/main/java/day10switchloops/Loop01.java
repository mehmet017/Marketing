package day10switchloops;

public class Loop01 {
    public static void main(String[] args) {
        //example 1: ekrana bes kere "Hi" yazdiriniz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.YOL
        // java biliyor ki biz ayni adimlari tekar tekrar aypmak zorunda kalabiliriz
        // iste bu tekarlari yapmak gerektiginde "LOOP"lari kullanmalisin
        // dort tane loop var
        //1. for-loop  2.while-loop 3. do while-loop 4.for-each-loop


        // 1. for-loop
        // for-loop un icine uc deger yazacaksin
        // birinci kisma baslangic degeri
        //2. kisma loop un calisma sartini
        //yani 2. kisimda loop un ne zaamana kadar calisacagini yaziyoruz
        // orn. i<6 5. degere kadar calis
        //3. kisima ise "increment" veya "decrement" degerini yaziyoruz


        // baslangic degeri     calisma sarti            increment/decrement
        for(int i=1            ;    i<6                  ; i++       ){

        }


        // simdi yukardaki "for"  ile kodu "update" de edebiliriz, degistirebiliriz de
        // 5000 tane "hi" bile yazarsin
        // for-loop da genellikle deger adi olarak 'i' kullanilir




        for (int i=11;i<15;i++){
            System.out.println(i);
        }

        //Example : 40 tan 23 e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
       for (int k=40;k>=23;k--){
           if (k%2==0){
               System.out.print(k+" ");
           }
       }

        System.out.println();

        for (int a=18; a<56;a++) {

            if (a%2!=0){
                System.out.print(a+ " ");
        }


        }



    }
}
