public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Employee(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // Metode untuk menghitung pendapatan karyawan
    public double earnings() {
        // Implementasikan perhitungan gaji sesuai tipe karyawan
        return 0.0;
    }
}
