package io.codelex.oop.persons;

import java.time.LocalDate;

public class Exercise2 {
    public static void main(String[] args) {
        Customer customer = new Customer("Peter", "Brown", "1", 20, "CID1234", 10);
        System.out.println(customer.getInfo());

        Employee employee = new Employee("Bob", "Burger", "2", 20, "Sales Manager", LocalDate.of(2015, 1, 1));
        System.out.println(employee.getInfo());
    }
}
