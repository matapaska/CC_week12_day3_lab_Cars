package cars;

import behaviours.IStartUp;
import carComponents.Battery;
import carComponents.Body;
import carComponents.Engine;
import carComponents.Tyres;

public class GasCar extends Car implements IStartUp {
    public GasCar(Battery battery, Body body, Engine engine, Tyres tyres) {
        super(battery, body, engine, tyres);
    }

    public String startUp() {
        return "Brum fume";
    }
}
