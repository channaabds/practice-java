package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner inputUser;
        float a,b, hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai pertama = ");
        a = inputUser.nextFloat();
        System.out.print("nilai operator = ");
        operator = inputUser.next();
        System.out.print("nilai kedua = ");
        b = inputUser.nextFloat();

        switch (operator){
            case "+":
                hasil = a + b;
                System.out.println("hasilnya adalah = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("hasilnya adalah = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("hasilnya adalah = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("hasilnya adalah = " + hasil);
                break;
            default :
                System.out.println(operator + " operator salah bro");
        }






    }
}
