package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert{
    private int copies;
    private int rate;
    private int costPerCopy;

    public Poster(int fee, int copies, int rate, int costPerCopy) {
        super(fee);
        this.copies = copies;
        this.rate = rate;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return super.cost() + rate * copies + costPerCopy * copies;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster: Copies=" + copies + " Rate=" + rate + " CostPerCopy=" + costPerCopy;
    }
}
