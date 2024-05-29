public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    protected static Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        Employee.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public double calculateBonus() {
        if (birthDate != null && birthDate.isBirthday()) {
            return 100.00;
        } else {
            return 0.00;
        }
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %s", getFirstName(), getLastName(), "Social Security Number", getSocialSecurityNumber());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
