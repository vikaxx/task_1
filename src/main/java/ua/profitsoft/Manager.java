package ua.profitsoft;

public class Manager extends Employee {
    private String firstName;
    private String lastName;
    private int id;

    private int salary;
    private int hours;

    private final double DEFAULT_WEEK_HOURS = (40.0 / 7.0) * 30.0;

    @Override
    boolean setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
            return true;
        }
        return false;
    }

    @Override
    boolean setWorkedHoursByThisWeek(int hours) {
        if (hours > 0) {
            this.hours = hours;
            return true;
        }
        return false;
    }

    @Override
    double getWorkedTimeInPercentByThisMonth() {
        return ((getHours() / 7.0) * 30.0) / DEFAULT_WEEK_HOURS;
    }

    @Override
    double getSalaryByThisMonth() {
        if (getWorkedTimeInPercentByThisMonth() < 1) {
            return getSalary() * getWorkedTimeInPercentByThisMonth();
        }
        return getSalary();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }
}
