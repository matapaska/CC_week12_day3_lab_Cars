package cars;

import carComponents.Battery;
import carComponents.Body;
import carComponents.Engine;
import carComponents.Tyres;

public class ElectricCar extends Car {
    public ElectricCar(Battery battery, Body body, Engine engine, Tyres tyres) {
        super(battery, body, engine, tyres);
    }
}
