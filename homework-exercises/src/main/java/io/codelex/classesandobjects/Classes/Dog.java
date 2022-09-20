package io.codelex.classesandobjects.Classes;

public class Dog {
    private String name;
    private String sex;
    private String father;
    private String mother;
    public Dog(String name, String sex,String father,String mother) {
        this.name = name;
        this.sex = sex;
        this.father = father;
        this.mother = mother;
    }
    public Dog(String name,String sex){
        this.name = name;
        this.sex = sex;
        this.father = "Unknown";
        this.mother = "Unknown";
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
    public String fathersName(){
        return father;
    }
    public boolean hasSameMotherAs(Dog otherDog) {
        return mother.equals(otherDog.mother);
    }
    public String toString() {
        return "Name: " + getName() + " Sex:" + getSex();
    }


}
