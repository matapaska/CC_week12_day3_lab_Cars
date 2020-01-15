package cutomer;

import behaviours.IStartUp;
import cars.Car;

import java.util.ArrayList;

    public class Customer {
    private double money;
    private ArrayList<IStartUp> ownedCars;

    public Customer(double money) {
        this.money = money;
        this.ownedCars = new ArrayList<IStartUp>();
    }

        public double getMoney() {
            return money;
        }

        public ArrayList<IStartUp> getOwnedCars() {
            return ownedCars;
        }
    }
