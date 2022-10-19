package io.codelex.polymorphism.practice.exercise3;

public class Exercise3Test {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", "123 Main St", 123, 3.5);
        Employee employee = new Employee("Jane", "Doe", "123 Main St", 123, "Manager");
        student.display();
        employee.display();
    }
}
