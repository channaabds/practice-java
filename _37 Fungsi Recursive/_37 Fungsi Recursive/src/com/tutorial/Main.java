package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan Nilai = ");
        int nilai = userInput.nextInt();

        System.out.println("Anda memasuka nilai = " + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = " + jumlah);
        System.out.println("Faktorial = " + faktorial(nilai));

    }
    // Fungsi Rekursif Sederhana

    private static int faktorial (int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 1){
            return parameter;
        }

        return parameter * faktorial(parameter - 1);
    }

    private static int jumlahNilai (int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 0){
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

    private static void printNilai (int parameter){
        System.out.println("Nilai = " + parameter);

        if (parameter == 0){
            return;
        }

        parameter--;

        printNilai(parameter);
    }

}
