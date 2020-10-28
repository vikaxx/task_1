package ua.profitsoft;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Programmer());
        employees.add(new Programmer());
        employees.add(new Programmer());
        employees.add(new Manager());
        employees.add(new Manager());
        employees.add(new Manager());

        int hours = 32;

        Accountant accountant = new Accountant();

        for (Employee current : employees) {
            current.setSalary(1000);
            current.setWorkedHoursByThisWeek(hours);
            System.out.print(hours + " hours ");
            hours += 2;

            System.out.println(current.getClass().getSimpleName() +
                    "'s salary is " +
                    accountant.accountSalary(current));
        }
    }
}
