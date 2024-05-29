package com.tutorial;

import javax.xml.transform.Source;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();

        // Exception handling (try,catch,finally)
        System.out.println("Handling out of bound");
        try{
            System.out.printf("index ke-%d, adalah %d\n", index,array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        // runtime error jika file tidak ada
        System.out.println("Handling IO not found");

        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e){
            System.err.println(e);
        }

        // menggabungkan 2 exception
        System.out.println("menggabungkan 2 buah Exception");

        try {
            System.out.printf("index ke-%d, adalah %d\n", index,array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("index yg anda masukan tidak sesuai dgn jumlah array");
        } catch (IOException e){
            System.err.println("file tidak ditemukan");
        }

        // Finally
        System.out.println("Menambahkan Finally");

        try {
            System.out.printf("index ke-%d, adalah %d\n", index,array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("index yg anda masukan tidak sesuai dgn jumlah array");
        } finally {
            System.out.println("finally");
        }

        System.out.println("\nakhir dri program");

    }
}
