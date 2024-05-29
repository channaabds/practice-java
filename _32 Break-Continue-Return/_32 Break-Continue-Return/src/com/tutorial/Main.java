package com.tutorial;

public class Main {

    public static void main (String[] args){

        // break, continue, dan return

        int a = 0;

        while (true){
            a++;

            if (a == 10){
                break; // ini adalah keyword untuk memaksa keluar dri loop
            } else if (a == 5){
                continue; // ini adalah keyword untuk memaksa memulai aksi dri awal
            } else if (a == 7){
                return;
            }

            System.out.println("Looping ke - " + a);
        }

        System.out.println("Akhir dri looping");

    }
}
