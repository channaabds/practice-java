package com.tutorial;

public class Main {

    public static void main (String[] args){

        // Operator Aritmatika

        int variable1 = 11;
        int variable2 = 5;

        int hasil;

        // 1. Penjumlahan

        hasil = variable1 + variable2;
        System.out.println("======PENJUMLAHAN======");
        System.out.println(variable1 + " + " + variable2 + " = " + hasil );

        // 2. Pengurangan

        hasil = variable1 - variable2;
        System.out.println("======PENGURANGAN======");
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);

        // 3. Perkalian

        hasil = variable1 * variable2;
        System.out.println("======PERKALIAN======");
        System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);

        // 4. Pembagian

        hasil = variable1 / variable2;
        System.out.println("======PEMBAGIAN======");
        System.out.printf("%d : %d = %d \n",variable1,variable2,hasil);

        float a = 6;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println(a + " : " + b + " = " + hasilFloat );

        // 5. Modulus

        hasil = variable1 % variable2;
        System.out.println("======MODULUS======");
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);




    }
}
