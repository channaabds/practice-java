package com.tutorial;

public class Main {

    public static void main(String[] args){

        // unary = operasi yang dilakukan pada satu variable

        // unary + dan -
        int angka = 1;
        System.out.printf("unary '-', %d menjadi %d\n",angka,-angka);
        System.out.printf("unary '+', %d menjadi %d\n",angka,+angka);

        // unary increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai increment dgn '++' menjadi = " + angka2);

        // unary decrement
        int angka3 = 10;
        angka3--;
        System.out.println("nilai increment dgn '--' menjadi = " + angka3);

        // Prefix dan Posfix
        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d\n", ++a);
        int b = 5;
        System.out.printf("nilai dengan '++' posfix menjadi = %d\n", b++);
        System.out.printf("nilai hasil dari posfix menjadi = %d\n", b);

        // unary boolean dengan ! untuk negasi
        boolean channa = true;
        System.out.println("nilai boolean = " + channa);
        System.out.println("nilai boolean setelah di negasi.in = " + !channa);



    }
}
