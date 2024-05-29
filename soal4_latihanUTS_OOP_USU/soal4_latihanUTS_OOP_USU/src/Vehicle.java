class Vehicle {
    private String myBrand, myModel;

    public Vehicle() {
        myBrand = "unknown";
        myModel = "unknown"; }

    public Vehicle(String brand, String model) {
        setBrand(brand);
        setModel(model);
        // other method
    }
}


/*

class Vehicle {
    private String myBrand, myModel;

    public Vehicle() {
        myBrand = "unknown";
        myModel = "unknown";
    }

    public Vehicle(String brand, String model) {
        setBrand(brand);
        setModel(model);
    }

    public void setBrand(String brand) {
        myBrand = brand;
    }

    public void setModel(String model) {
        myModel = model;
    }

    public String getBrand() {
        return myBrand;
    }

    public String getModel() {
        return myModel;
    }

    // You can add more methods related to vehicles here
}

class Bicycle extends Vehicle {
    public Bicycle(String brand, String model) {
        super(brand, model);
    }

    // Additional methods specific to bicycles can be added here
}

class Sedan extends Vehicle {
    public Sedan(String brand, String model) {
        super(brand, model);
    }

    // Additional methods specific to sedans can be added here
}

class Truck extends Vehicle {
    public Truck(String brand, String model) {
        super(brand, model);
    }

    // Additional methods specific to trucks can be added here
}

public class Main {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle("Giant", "Defy Advanced");
        Sedan myCar = new Sedan("Toyota", "Camry");
        Truck myTruck = new Truck("Ford", "F-150");

        System.out.println("My bike is a " + myBike.getBrand() + " " + myBike.getModel());
        System.out.println("My car is a " + myCar.getBrand() + " " + myCar.getModel());
        System.out.println("My truck is a " + myTruck.getBrand() + " " + myTruck.getModel());

        // You can call other methods or perform operations on the vehicles here
    }
}

In this example, I've created three subclasses: Bicycle, Sedan, and Truck.
Each of these subclasses has a constructor that calls the superclass constructor using super(brand, model).
This way, the Vehicle class's constructor is executed, and the brand and model are set appropriately.

You can add additional methods specific to each type of vehicle in their respective classes.

class Kendaraan {
    private String merek, model;

    public Kendaraan() {
        merek = "unknown";
        model = "unknown";
    }

    public Kendaraan(String merek, String model) {
        setMerek(merek);
        setModel(model);
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    // Anda dapat menambahkan method lain terkait kendaraan di sini
}

class Sepeda extends Kendaraan {
    public Sepeda(String merek, String model) {
        super(merek, model);
    }

    // Method tambahan khusus untuk sepeda dapat ditambahkan di sini
}

class Sedan extends Kendaraan {
    public Sedan(String merek, String model) {
        super(merek, model);
    }

    // Method tambahan khusus untuk sedan dapat ditambahkan di sini
}

class Truk extends Kendaraan {
    public Truk(String merek, String model) {
        super(merek, model);
    }

    // Method tambahan khusus untuk truk dapat ditambahkan di sini
}

public class Utama {
    public static void main(String[] args) {
        Sepeda sepedaSaya = new Sepeda("Polygon", "Xtrada");
        Sedan mobilSaya = new Sedan("Toyota", "Camry");
        Truk trukSaya = new Truk("Isuzu", "Elf");

        System.out.println("Sepeda saya adalah " + sepedaSaya.getMerek() + " " + sepedaSaya.getModel());
        System.out.println("Mobil saya adalah " + mobilSaya.getMerek() + " " + mobilSaya.getModel());
        System.out.println("Truk saya adalah " + trukSaya.getMerek() + " " + trukSaya.getModel());

        // Anda dapat memanggil method lain atau melakukan operasi lain pada kendaraan di sini
    }
}

Dalam contoh ini, saya telah membuat tiga subclass: Sepeda, Sedan, dan Truk.
Setiap subclass memiliki konstruktor yang memanggil konstruktor superclass menggunakan super(merek, model).
Dengan cara ini, konstruktor dari kelas Kendaraan akan dieksekusi, dan merek dan model akan diatur dengan benar.

Anda dapat menambahkan method tambahan yang spesifik untuk setiap jenis kendaraan di kelas-kelas mereka masing-masing.

Output dari program tersebut akan menjadi:
Sepeda saya adalah Polygon Xtrada
Mobil saya adalah Toyota Camry
Truk saya adalah Isuzu Elf

Ini adalah hasil dari memanggil metode getMerek() dan getModel() pada objek sepedaSaya, mobilSaya, dan trukSaya.
Karena setiap objek telah diinisialisasi dengan merek dan model yang spesifik saat dibuat, maka ketika kita memanggil metode tersebut, kita akan mendapatkan merek dan model yang sesuai.



 */