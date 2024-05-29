package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

         // membuat string

        String kataString = "hallo";

        char[] kataChar = {'h','a','l','l','o'};

        // menampilkan string

        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        // mengakses komponen String

        System.out.println("komponen pertama dari char[] = " + kataChar[3]);
        System.out.println("komponen pertama dari String = " + kataString.charAt(3));

        // merubah komponen dri String
        // itu tidak bisa.... kenapa? kaena string di java itu Imutable
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));

        // kataString[0] = "c" <----- tidak bisa
        // kataString.charAt(0) = "c"  <------ tidak bisa

        // kita bisa merubah komponen string secara tidak langsung untuk mengakali

        printAddres("kataString",kataString);

        System.out.println("c" + kataString.substring(1,5));

        System.out.println(kataString);

        printAddres("kataString",kataString);

        // memory dari String (string pool)

        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";

        printAddres("str_1",str_1);
        printAddres("str_2",str_2);
        printAddres("str_3",str_3);

        str_3 = str_3.substring(0,4);
        printAddres("str_3",str_3);

        String str_4 = "callo";
        printAddres("str_4",str_4);

        kataString = "callo";
        printAddres("kataString",kataString);

        // 1. String di java itu imutable
        // 2. string yang berada di string pool itu akan reusble, memorinya lebih efisien
        // 3. membuat string dengan method baru, maka dia akan ditaro di memory lain bukan di string pool

        // liat lebih dalam

        String a = new String("hallo");
        printAddres("a",a);

    }

    private static void printAddres(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
