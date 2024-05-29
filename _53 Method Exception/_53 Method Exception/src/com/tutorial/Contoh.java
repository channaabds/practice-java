package com.tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Contoh {

    public static void main(String[] args) throws IOException {

        FileInputStream inputFIle = new FileInputStream("input.txt");

        System.out.println((char) inputFIle.read());
    }
}
