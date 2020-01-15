package dealership;

import behaviours.IStartUp;

import java.util.ArrayList;

public class Dealership {
    private double till;
    private ArrayList<IStartUp> stock;

    public Dealership(double till, ArrayList<IStartUp> stock) {
        this.till = till;
        this.stock = stock;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<IStartUp> getStock() {
        return stock;
    }
}
