// Main class
public class Main {
    public static void main(String[] args) {
        Date channaBirthday = new Date(10, 12, 1985); // Assuming format is MM/DD/YYYY
        Employee channa = new Employee("Channa", "Abdullah Salim", channaBirthday);

        Date ristaBirthday = new Date(7, 8, 1990);
        Employee rista = new Employee("Ikharista", "Ayu", ristaBirthday);

        Employee[] employees = {channa, rista};

        int currentMonth = 10; // Assuming it's October

        for (Employee employee : employees) {
            double payroll = employee.calculatePay();
            if (employee.birthdayBonus(currentMonth)) {
                payroll += 100.00;
            }
            System.out.println(employee.getFirstName() + " " + employee.getLastName() +
                    "'s payroll for this month is $" + payroll);
        }
    }
}
