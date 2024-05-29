package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] arrayAngka1 = {1,2,3,4,5};

        // merubah array menjadi string
        System.out.println("\n===== Merubah Array Menjadi String =====");
        printArray(arrayAngka1);

        // mengkopi array
        System.out.println("\n===== Mengkopi Array =====");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\n===== Mengkopi dengan loop =====");
        for(int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\n===== Mengkopi dengan copyOf =====");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\n===== Mengkopi dengan copyOfRange =====");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,3,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\n===== Fill Array =====");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);

        // komparasi array
        System.out.println("\n===== Komparasi Array =====");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,7,5};


        System.out.println("\nMembandingkan antara 2 buah array =====");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("Array ini sama");
        } else {
            System.out.println("Array ini beda");
        }

        System.out.println("\nngecek mana array yg lebih besar =====");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\nngecek mana indeks yg berbeda =====");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        // search array
        System.out.println("\n===== Sort Array =====");
        int[] arrrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrrayAngka8);
        Arrays.sort(arrrayAngka8);
        printArray(arrrayAngka8);

        // search array
        System.out.println("\n===== Search Array =====");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrrayAngka8,angka);
        System.out.println("angka " + angka + " ada di indeks " + posisi);


    }

    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}
