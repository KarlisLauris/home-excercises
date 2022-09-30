package io.codelex.oop.computers;

public class Exercise7 {

    public static void main(String[] args) {
        Computer computer = new Computer("i7", "16GB", "GTX 1080", "Dell", "XPS 15");
        Computer computer2 = new Computer("i7", "16GB", "GTX 1080", "Dell", "XPS 15");
        Computer computer3 = new Computer("i7", "16GB", "GTX 1080", "Dell", "XPS 16");
        Laptop laptop = new Laptop("i7", "16GB", "GTX 1080", "Dell", "XPS 15", "Lithium");
        Laptop laptop2 = new Laptop("i7", "16GB", "GTX 1080", "Dell", "XPS 15", "Lithium");

        System.out.println(computer.equals(computer2));
        System.out.println(computer.equals(computer3));
        System.out.println(laptop.equals(laptop2));
        System.out.println(laptop.equals(computer));
        System.out.println(laptop2.toString());
        System.out.println(computer.hashCode());
    }
}
