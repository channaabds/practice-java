package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // membuka File

        // byte stream -> FileInputStream
        // character stream -> FileReader

        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("output.txt");
        FileWriter charFileOutput = new FileWriter("outputChar.txt");

        // Membaca File

        // Byte File
        int buffer = byteFileInput.read();

        while (buffer != -1){
            System.out.print((char) buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n");
        // Char File
        buffer = charFileInput.read();

        while (buffer != -1){
            System.out.print((char) buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        // Menutup File

        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();


    }
}
