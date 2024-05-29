package com.tutorial;

public class Main {

    public static void main (String[] args){

        // void itu artinya hampa

        System.out.println(simpel());

        fungsiVoid("apa pun");
        selamatPagi("Channa");
        selamatPagi("Abdullah");
        selamatPagi("Salim");

    }

    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
    }

    // Fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }


    // fungsi atau method dengan kembalian
    // sehingga menggunakan return untuk
    // mengembalikan nilainya (10.0F)
    private static float simpel(){
        return 10.0f;
    }
}
