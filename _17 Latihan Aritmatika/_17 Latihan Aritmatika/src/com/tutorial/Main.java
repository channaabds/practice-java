package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        int panjang, lebar, luas, tinggi, volume, keliling;

        // Membuat Perhitungan menghitung luas persegi panjang
        // Luas = panjang * lebar

        System.out.println("===== MENGHITUNG LUAS & KELILING PERSEGI PANJANG =====");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling = " + keliling);

        System.out.println("===== Menghitung Volume =====");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();

        volume = tinggi * luas;
        System.out.println("Volume = " + volume);


    }
}
