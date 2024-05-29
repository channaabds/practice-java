public class Test {
    public int aMethod() {
        int i = 0; i++; return i; }
    public static void main(String args[]) {
        Test test = new Test(); test.aMethod();
        int j = test.aMethod(); System.out.println(j);
    }
}






















/*

Program di atas adalah sebuah kelas Java yang disebut Test.
Program ini memiliki dua metode: aMethod dan main.

aMethod adalah metode non-statis yang mengembalikan sebuah integer.
Di dalamnya, terdapat sebuah variabel lokal i yang dideklarasikan sebagai static.
Pada setiap panggilan metode aMethod, nilai i akan diinkrementasi dan kemudian dikembalikan.

Di dalam metode main, pertama-tama kita membuat objek test dari kelas Test.
Kemudian, kita memanggil aMethod dua kali pada objek tersebut.

Panggilan pertama test.aMethod() akan menambahkan nilai i dari 0 menjadi 1, dan mengembalikan nilai 1.

Panggilan kedua test.aMethod() akan menambahkan nilai i dari 1 menjadi 2, dan mengembalikan nilai 2.

Nilai 2 (hasil dari panggilan kedua aMethod) akan disimpan di dalam variabel j.

Selanjutnya, program akan mencetak nilai dari j, yaitu 2.

Jika Anda mengubah modifier static menjadi private pada deklarasi variabel i, maka akan terjadi kesalahan kompilasi.
Karena variabel i di dalam metode aMethod tidak dapat diakses jika tidak memiliki modifier akses yang memungkinkan akses dari luar kelas.
Dalam kasus ini, dengan mengubah static menjadi private, i tidak akan dapat diakses di luar dari metode aMethod, dan program akan mengalami kesalahan kompilasi.
















 */