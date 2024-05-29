package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== BELAJAR ARRAY MULTIDIMENSI =====");

        // cara membuat array 2 dimensi dengan assignment
        System.out.println("=== ARRAY 2 DIMENSI DENGAN ASSIGNMENT ===");

        int[][] array_2D = {
                {1,2},
                {3,4}
        };

        printArray2D(array_2D);

        // cara membuat array 2 dimensi dengan deklarasi
        // int[baris][kolom]
        System.out.println("=== ARRAY 2 DIMENSI DENGAN DEKLARASI ===");
        int[][] arrayAngka = new int[5][4];

        printArray2D(arrayAngka);

        // looping lengkap secara manual
        System.out.println("=== LOOPING LENGKAP SECARA MANUAL ===");

        for(int i = 0; i < arrayAngka.length; i++){
            System.out.print("[");
            for(int j = 0; j < arrayAngka[i].length; j++){
                System.out.print(arrayAngka[i][j] + ",");
            }
            System.out.println("]");
        }

        // looping for each
        System.out.println("=== LOOPING DENGAN FOR EACH ===");

        for(int[] baris : arrayAngka){
            System.out.print("[");
            for(int angka : baris){
                System.out.print(angka + ",");
            }
            System.out.println("]");
        }

        // array secara manual, pembuktian
        System.out.println("=== array secara manual, pembuktian ===");

        int[][] array_2D_2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
        };

        printArray2D(array_2D_2);

        // Array Ragged
        System.out.println("=== array ragged ===");

        int[][] array_ragged = {
                {1,2,3,4},
                {5,6,1},
                {10}
        };

        printArray2D(array_ragged);

    }

    private static void printArray2D(int[][] dataArray){
        for (int i = 0; i < dataArray.length; i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }

}
