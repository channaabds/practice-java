package com.tutorial;

public class Main {

    public static void main (String [] args){

        // Tipe data di Java
        // integer, byte, short, long, double, float, char, boolean

        // integer (satuan)
        int i = 11;
        System.out.println("======INTEGER======");
        System.out.println("nilai integer = " + i);
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar Integer = " + Integer.SIZE + " bit");

        // byte (satuan)
        byte b = 11;
        System.out.println("======BYTE======");
        System.out.println("nilai byte b = " + b);
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar Integer = " + Byte.BYTES + " bytes");
        System.out.println("Besar Integer = " + Byte.SIZE + " bit");

        // SHORT (satuan)
        short s = 11;
        System.out.println("======SHORT======");
        System.out.println("nilai short s = " + s);
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " bytes");
        System.out.println("Besar Short = " + Short.SIZE + " bit");

        // long (satuan)
        long l = 10L;
        System.out.println("======LONG======");
        System.out.println("nilai byte l = " + l);
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " bytes");
        System.out.println("Besar Long = " + Long.SIZE + " bit");

        // double (koma, bilangan real)
        double d = 10.5d;
        System.out.println("======DOUBLE======");
        System.out.println("nilai double d = " + d);
        System.out.println("nilai max = " + Double.MAX_VALUE);
        System.out.println("nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " bytes");
        System.out.println("Besar Double = " + Double.SIZE + " bit");

        // float (koma, bilangan real)
        float f = -8.5f;
        System.out.println("======FLOAT======");
        System.out.println("nilai float f = " + f);
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " bytes");
        System.out.println("Besar Float = " + Float.SIZE + " bit");

        // char (karakter) berdasarkan ASCII
        char c = 'c';
        System.out.println("======CHAR======");
        System.out.println("nilai char c = " + c);
        System.out.println("nilai max = " + Character .MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar Char = " + Character.BYTES + " bytes");
        System.out.println("Besar Char = " + Character.SIZE + " bit");

        // boolean (nilai true / false)
        boolean val = false;
        System.out.println("======BOOLEAN======");
        System.out.println("nilai boolean val = " + val);
        System.out.println("nilai max = " + Boolean.TRUE);
        System.out.println("nilai min = " + Boolean.FALSE);
        
    }
}
