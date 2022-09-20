package io.codelex.classesandobjects;
import io.codelex.classesandobjects.Classes.Product;
public class Exercise1 {
    public static void main(String[] args) {
        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);
        product1.printProduct();
        product2.printProduct();
        product3.printProduct();

        product1.setAmountAtStar(17);
        product1.printProduct();
        product3.setPriceAtStart(450.94);
        product3.printProduct();
    }
}
