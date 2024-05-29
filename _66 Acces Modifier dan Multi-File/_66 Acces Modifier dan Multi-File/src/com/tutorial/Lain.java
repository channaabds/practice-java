package com.tutorial;

public class Lain {

    // bagian ini dapat di acces oleh siapapun
    public static void methodPublic(){
        System.out.println("Lain:public");
    }

    // ini hanya dapat di acces oleh class yang bersangkutan
    private static void methodPrivate(){
        System.out.println("Lain:private");
    }

    // ini hanya dapat di acces oleh class dalam package yang sama
    static void methodDefault(){
        System.out.println("Lain:default");
    }

    // ini hanya dapat di acces oleh class dalam package yang sama dan subclassnya
    protected static void methodProtected(){
        System.out.println("Lain:protected");
    }
}
