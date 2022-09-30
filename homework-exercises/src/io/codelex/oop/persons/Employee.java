package io.codelex.oop.persons;

import java.time.LocalDate;

public class Employee extends Person{
    private String position;
    private LocalDate startedWorking;

    Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public String getWorkExperience(){
        return startedWorking.until(LocalDate.now()).getYears() + " years";
    }

    @Override
    public String getInfo(){
        return this.position+ getFirstName() + getLastName() + " (" + getWorkExperience() + ")";
    }
}
