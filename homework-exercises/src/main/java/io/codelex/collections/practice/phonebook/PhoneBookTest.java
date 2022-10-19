package io.codelex.collections.practice.phonebook;

public class PhoneBookTest {
    public static void main(String [] args){
        PhoneEntry entry = new PhoneEntry();
        entry.name = "John";
        entry.number = "12345678";
        PhoneEntry entry2 = new PhoneEntry();
        entry2.name = "Jane";
        entry2.number = "87654321";
        PhoneDirectory directory = new PhoneDirectory();
        directory.putNumber(entry.name, entry.number);
        directory.putNumber(entry2.name, entry2.number);
        System.out.println(directory.getNumber("John"));
        System.out.println(directory.getNumber("Jane"));
        directory.putNumber("John", "11111111");
        System.out.println(directory.getNumber("John"));
    }
}
