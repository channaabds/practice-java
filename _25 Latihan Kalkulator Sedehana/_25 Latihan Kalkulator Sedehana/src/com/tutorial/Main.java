package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai pertama = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai kedua = ");
        b = inputUser.nextFloat();

        System.out.println("input user " + a + " " + operator + " " + b);

        // operator tersedia * / + -

        if (operator == '+'){
            hasil = a + b;
            System.out.println("hasilnya adalah = " + hasil);
        } else if (operator == '-'){
            hasil = a - b;
            System.out.println("hasilnya adalah = " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("hasilnya adalah = " + hasil);
        } else if (operator == '/'){
            if (b == 0){
                System.out.println("Pembagi Nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("hasilnya adalah = " + hasil);
            }
        } else {
            System.out.println("Input salah");
        }

    }
}
