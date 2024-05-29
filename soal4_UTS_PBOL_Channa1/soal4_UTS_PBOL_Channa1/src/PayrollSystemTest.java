public class PayrollSystemTest {
    public static void main(String[] args) {
        Date currentDate = new Date(10, 12, 2023); // Ganti dengan tanggal hari ini
        int currentMonth = currentDate.getMonth();

        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("John", "Doe", new Date(4, 5, 1990));
        employees[1] = new HourlyEmployee("Jane", "Smith", new Date(6, 15, 1985));
        employees[2] = new CommissionEmployee("Bob", "Johnson", new Date(10, 12, 1988));

        for (Employee employee : employees) {
            double earnings = employee.earnings();
            System.out.printf("Karyawan %s %s mendapatkan: $%.2f%n",
                    employee.getFirstName(),
                    employee.getLastName(),
                    earnings);

            if (employee.getBirthDate().getMonth() == currentMonth) {
                earnings += 100.0;
                System.out.printf("Bonus ulang tahun $100 ditambahkan. Pendapatan baru: $%.2f%n", earnings);
            }
        }
    }
}
