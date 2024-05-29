package com.tutorial;

public class Main {

    public static void main (String[] args){

        System.out.println("Ini adalah awal program");

        for (int nilai = 0; nilai <= 10; nilai++){

            System.out.println("for loop ke - " + nilai);
        }

        System.out.println("Loop Kedua");

        for (int nilai = 0; nilai < 10; nilai++){

            System.out.println("for loop ke - " + nilai);
        }

        System.out.println("Loop Ketiga");

        for (int nilai = 10; nilai >= 5; nilai--){

            System.out.println("for loop ke - " + nilai);
        }

        System.out.println("Loop Keempat");

        int nilai = 0;
        for (; nilai < 10 ;){

            System.out.println("for loop ke - " + nilai);
            nilai++;
        }

        System.out.println("ini adalah akhir program");

    }
}
