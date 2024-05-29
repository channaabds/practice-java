public class Machine {
    public void go(){
        System.out.println("I must be going!");
    }
    public void go(int x) {
        System.out.println("Hi there! - your number is " + x);
        go();
    }
}



/*

When the provided code fragment is executed, the output will be:

Hello!
Hi there! - your number is 10
I must be going!

Here's an explanation of what happens step by step:

Machine x = new SpecialMachine(); creates a reference x of type Machine that points to an instance of SpecialMachine.

x.go(9); calls the go(int x) method of SpecialMachine with the argument 9.

In SpecialMachine, the method go(int x) prints "Hello!".

Then, it calls super.go(x + 1);. This invokes the go(int x) method of the superclass Machine. x + 1 is 10, so it prints "Hi there! - your number is 10".

Finally, the go() method is called. Since there is no argument, it calls the go() method of Machine, which prints "I must be going!".

Berikut adalah penjelasan langkah demi langkah dari apa yang terjadi:

1. Machine x = new SpecialMachine();
membuat referensi x bertipe Machine yang menunjuk ke sebuah instansi dari SpecialMachine.

2. x.go(9); memanggil metode go(int x) dari SpecialMachine dengan argumen 9.

Di dalam SpecialMachine, metode go(int x) mencetak "Hello!".

Lalu, ia memanggil super.go(x + 1);. Hal ini memanggil metode go(int x) dari superclass Machine. x + 1 adalah 10, sehingga mencetak "Hi there! - angka Anda adalah 10".

Terakhir, metode go() dipanggil. Karena tidak ada argumen, ia memanggil metode go() dari Machine, yang mencetak "Saya harus pergi!".




 */




























