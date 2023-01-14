package day24accessmodifiersinheritance;

public class Animal {
        /*
        Inheritance'in faydalari;
        1) Code standardında tekrar iyi değildir.
        2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
        3) Gelişime update'e açık olmalıdır
        4) Code atomic yapıda olmalı.
        Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
        Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
        Note 3: public method lar "child" class lar tarafindan kullanilabilir
                "chil" class lar tarafindan kullanilabilir demek "inherit edilebilir" demektir.
        Note 4:"protected" methodlar "inherit edilebilir"
                Cunku "protected" olan method ve variable'lar child'lar tarafindan kullanilir.
        Note 5: "default" methodlar object ile ayni package da olduklari surece "inherit edilebilirler"
                Ama default method ile object in uretildigi class farkli package lerde ise inherit edilemezler
        Note 6: private method'lar "inherit edilemezler"
        Note 7: Java birden fazla parent'i (multiple inheritance Java tarafindan desteklenmez) onaylamaz.
        Note 8: Child --> Parent --> Grand Parent --> Grand Grand Parent... seklinde
                ilerleyen inherithance'lara "Multi Level Inheritance" denir.
        Note 9: Java'da "Object Class" tum Java Class'larinin ortak parent'idir.
        Note 10: Java'da "Object Class" tum Java Class'larin parent'i vardir. Parenti olmaya
                 tek Class "Object Class" tir.
        Note 11: Java'da "parent" tan "child" a olan ilişkilere "HAS-A Relationship" denir
        Note 11: Java'da "child" tan "parent" a olan ilişkilere "IS-A Relationship" denir
        Note 12: Java'da her class'in bir tane default constructor'i vardir.
                 Bu default constructor class'in icinde gorunmez cunku default constructor "Object Class" icindedir
                 Bizim class'imiz default constructor'a ihtiyac duydugunda parent
                 olan "Object Class" a gider oradaki constructor'i kullanir
         */
    public void eat(){
        System.out.println("Animals eat...");
    }

 public void drink(){
        System.out.println("Animals drink...");
    }
}
