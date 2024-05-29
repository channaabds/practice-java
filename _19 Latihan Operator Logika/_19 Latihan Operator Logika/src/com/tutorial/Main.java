package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){

        // Membuat sebuah objek untuk menagkap input dri user
        Scanner inputUser = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 7;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("masukan nilai tebakan anda = ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah = " + nilaiTebakan);

        // Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan Anda = " + statusTebakan);

        // Operasi aljabar boolean (and / or)

        System.out.println("=== OPERASI ALJABAR BOOLEAN AND / OR ===");
        System.out.print("masukan nilai diantara 4 sampai 9 = ");
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        /*
                a | b | c
                0   0  0
                0   1   0
                1   0   0
                1   1   1
         */

        System.out.println("tebakan anda = " + statusTebakan);

    }
}
