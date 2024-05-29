class A {
    public void someMeth(){
        System.out.println( "from class A" );
    }
}
class B extends A {
    public void someMeth( String x ){
        System.out.println( "from class B: " + x );
    }
}
















/*

Dalam kode Java yang diberikan, terdapat hubungan warisan (inheritance) antara kelas A dan B. Kelas B meng-extend kelas A, yang berarti kelas B mewarisi semua anggota (field dan method) dari kelas A.

Namun, terjadi overriding method di sini. Kelas B memiliki method bernama someMeth yang memiliki tanda tangan yang berbeda (menerima parameter String x) dibandingkan dengan someMeth di kelas A. Hal ini diperbolehkan dalam Java selama method di subclass memiliki nama yang sama dengan method di superclass dan tipe parameter bersifat kovarian (artinya, tipe parameter subclass lebih spesifik atau sama dengan tipe parameter superclass).

Dalam kasus ini, someMeth di kelas B dengan parameter String disebut sebagai overriding terhadap someMeth di kelas A. Ini berarti bahwa ketika Anda memanggil someMeth pada sebuah instansi dari kelas B, versi dari method yang didefinisikan di kelas B akan dieksekusi.

Jika Anda membuat sebuah instansi dari kelas B dan memanggil someMeth, maka akan menjalankan versi yang didefinisikan di kelas B, mencetak "from class B: " diikuti dengan nilai dari x.

Jika Anda membuat sebuah instansi dari kelas A dan memanggil someMeth, maka akan menjalankan versi yang didefinisikan di kelas A, mencetak "from class A".














 */