package java8casestudy;

import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
}

public class EmployeeLambdaDemo {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("Alice", 45000),
            new Employee("Bob", 55000)
        );

        // Sort by name
        list.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Sorted by Name: " + list);

        // Filter salary > 50000
        list.stream().filter(e -> e.getSalary() > 50000).forEach(System.out::println);
    }
}
