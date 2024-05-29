package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        // Ternary Operator

        int input,x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan Nilai = ");
        input = inputUser.nextInt();

        // varible x = ekspresi ? statment_true : statment_false

        x = (input == 10) ? (input * input) : (input / 2);

        /* Jika memakai if
        if (input == 10){
            x = input * input;
         }else{
            x = input / 2
         }
         */

        System.out.println("hasilnya = " + x);

    }
}
