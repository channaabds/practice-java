// Date class (Fig. 8.7)
class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
}

// Employee class
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

    public boolean birthdayBonus(int currentMonth) {
        return currentMonth == birthDate.getMonth();
    }

    public double calculatePay() {
        // Implement your pay calculation logic here
        return 0.0; // Placeholder, replace with actual calculation
    }
}

