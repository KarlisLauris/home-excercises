package io.codelex.classesandobjects.Classes;

public class Product {
    private String name;
    private  double priceAtStart;
    private int amountAtStar;

    public Product(String name, double priceAtStart, int amountAtStar) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStar = amountAtStar;
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public void setAmountAtStar(int amountAtStar) {
        this.amountAtStar = amountAtStar;
    }

    public void printProduct() {
        System.out.println(name + ", price " + priceAtStart + ", amount " + amountAtStar);
    }
}
