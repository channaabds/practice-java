package com.tutorial;

import kelasterbuka.util.Memasak;

public class Main {
    public static void main(String[] args) {
        // public, private, default, dan protected

        // dengan akses modifier publik, dapat diakses
        Lain.methodPublic();

        // dengan acces modifier private tidak dapat diakses
        // Lain.methodPrivate();

        // karena ada dalam package yang sama, maka dapat diakses
        Lain.methodDefault();

        // karena ada dalam package yang sama, maka dapat diakses
        Lain.methodProtected();

        Memasak.dagingPublic();

        // Memasak.dagingPrivate();   tidak bisa
        // Memasak.dagingDefault();   tidak bisa
        // Memasak.dagingProtected();   tidak bisa

    }



}
