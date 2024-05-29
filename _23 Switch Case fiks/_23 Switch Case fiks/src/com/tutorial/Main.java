package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Switch Case

        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama = ");
        input = inputUser.next();

        // ekspresi berupa satuan (int,byte,long,short), string atau enum

        switch (input){
            case "otong":
                System.out.println("saya otong dan hadir boss!!!");
                break;
            case "ucup":
                System.out.println("saya ucup hadir juga ngab");
                break;
            case "mario":
                System.out.println("saya mario hadir juga ngab");
                break;
            default:
                System.out.println(input + " Tidak Hadir oi");
        }

        System.out.println("Selesai Program");

    }
}
