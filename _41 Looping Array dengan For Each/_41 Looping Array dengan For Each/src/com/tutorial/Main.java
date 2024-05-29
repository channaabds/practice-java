package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int arrayAngka[] = {11,12,13,14,15,16,17,18,19,20};

        // looping standard
        System.out.println("===== Looping Standard ======");
        for (int i = 0; i < 10; i++){
            System.out.println("indeks ke - " + i + " adalah = " + arrayAngka[i]);
        }

        // Looping dengan properti array
        System.out.println("===== Looping dengan properti Length ======");
        for (int i = 0; i < arrayAngka.length; i++){
            System.out.println("indeks ke - " + i + " adalah = " + arrayAngka[i]);
        }

        // Looping khususon untuk collection <- array
        System.out.println("===== Looping for each ======");
        for (int angka : arrayAngka){
            System.out.println("angka pada loopiing ini = " + angka);
        }


    }
}
