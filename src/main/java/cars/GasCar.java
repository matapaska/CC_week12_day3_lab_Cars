package cars;

import carComponents.Battery;
import carComponents.Body;
import carComponents.Engine;
import carComponents.Tyres;

public class GasCar extends Car {
    public GasCar(Battery battery, Body body, Engine engine, Tyres tyres) {
        super(battery, body, engine, tyres);
    }
}
