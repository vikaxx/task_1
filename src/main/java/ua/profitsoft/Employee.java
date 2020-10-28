package ua.profitsoft;

import java.util.Date;

public abstract class Employee {
    String firstName;
    String lastName;
    int id;

    abstract boolean setSalary(int salary);

    abstract boolean setWorkedHoursByThisWeek(int hours);

    abstract double getWorkedTimeInPercentByThisMonth();

    abstract double getSalaryByThisMonth();
}
