//
//public abstract class Asset { }
//public class Bond extends Asset { }
//public class Stock extends Asset { }
//
//public class Test {
//    public static void main(String[] args) {
//        Asset[] list = new Asset[5];
//
//        for (int i = 0; i < list.length; i++)
//            if (Math.random() >= 0.5)
//                list[i] = new Bond();
//        else
//            list[i] = new Stock();
//
//        int count = 0;
//        for (int i = 0; i < list.length; i++){
//
//            // INSERT LINE HERE
//            if (item instanceof Bond)
//                count++;
//        }
//        System.out.println(count+" bonds");
//    }
//}


abstract class Asset { }

public class Test {
    public static void main(String[] args) {
        Asset[] list = new Asset[5];

        for (int i = 0; i < list.length; i++) {
            if (Math.random() >= 0.5)
                list[i] = new Bond();
            else
                list[i] = new Stock();
        }

        int count = 0;
        for (int i = 0; i < list.length; i++) {
            Asset item = list[i]; // Tambahkan baris ini untuk mendapatkan elemen saat ini

            if (item instanceof Bond)
                count++;
        }
        System.out.println(count + " bonds");
    }
}




/*

To correctly extract each item from the array and count how many bonds are in the portfolio, you can use the following code:

for (int i = 0; i < list.length; i++) {
    Asset item = list[i];
    if (item instanceof Bond) {
        count++;
    }
}

This loop iterates through the list array and checks if each item is an instance of Bond.
If it is, it increments the count variable. At the end of the loop, count will hold the total number of bonds in the portfolio.

for (int i = 0; i < list.length; i++) {
Baris ini memulai sebuah perulangan yang akan mengiterasi melalui array list.
Ini menggunakan variabel i sebagai penghitung perulangan untuk mengakses setiap elemen dari array tersebut.

    Asset item = list[i];
Di dalam perulangan, baris ini mengambil elemen ke-i dari array list dan menetapkannya ke variabel bernama item.
item adalah tipe Asset, yang merupakan superclass dari baik Bond maupun Stock.

    if (item instanceof Bond) {
Baris ini memeriksa apakah item adalah instance dari Bond.
Operator instanceof akan mengembalikan true jika item adalah instance dari Bond, dan false jika tidak.

Jika item adalah instance dari Bond, maka kode di dalam blok {} akan dijalankan.

        count++;
Baris ini menambahkan nilai count.
Jika item adalah instance dari Bond, itu berarti kita telah menemukan sebuah obligasi dalam portofolio, sehingga kita menambahkan count.


 */


























