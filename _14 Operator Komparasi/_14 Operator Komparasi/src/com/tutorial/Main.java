package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Operator komparasi... ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        // Operator Equal atau Persamaan
        System.out.println("-----PERSAMAAN-----");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ---> %s \n",a,b,hasilKomparasi);

        a = 15;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ---> %s \n",a,b,hasilKomparasi);

        // Operator Not Equal atau Pertidaksamaan
        System.out.println("-----PERTIDAKSAMAAN-----");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ---> %s \n",a,b,hasilKomparasi);

        a = 15;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ---> %s \n",a,b,hasilKomparasi);

        // Operator less than atau Kurang dari
        System.out.println("-----KURANG dari-----");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d ---> %s \n",a,b,hasilKomparasi);

        a = 15;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d ---> %s \n",a,b,hasilKomparasi);

        // Operator greater then atau lebih dari
        System.out.println("-----LEBIH dari-----");
        a = 9;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d ---> %s \n",a,b,hasilKomparasi);

        a = 15;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d ---> %s \n",a,b,hasilKomparasi);

        // Operator less than equal atau Kurang dari sama dengan
        System.out.println("-----KURANG dari sama dengan-----");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b,hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b,hasilKomparasi);

        a = 15;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b,hasilKomparasi);

        // Operator greater then atau lebih dari sama dengan
        System.out.println("-----LEBIH dari sama dengan-----");
        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b,hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b,hasilKomparasi);

        a = 15;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b,hasilKomparasi);

    }
}
