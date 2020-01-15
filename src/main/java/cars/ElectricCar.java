package cars;

import behaviours.IStartUp;
import carComponents.Battery;
import carComponents.Body;
import carComponents.Engine;
import carComponents.Tyres;

public class ElectricCar extends Car implements IStartUp {
    public ElectricCar(Battery battery, Body body, Engine engine, Tyres tyres) {
        super(battery, body, engine, tyres);
    }

    public String startUp() {
        return "Zooom";
    }
}
