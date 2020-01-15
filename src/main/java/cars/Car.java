package cars;

import carComponents.Battery;
import carComponents.Body;
import carComponents.Engine;
import carComponents.Tyres;

public abstract class Car {

    Battery battery;
    Body body;
    Engine engine;
    Tyres tyres;

    public Car(Battery battery, Body body, Engine engine, Tyres tyres) {
        this.battery = battery;
        this.body = body;
        this.engine = engine;
        this.tyres = tyres;
    }

    public Battery getBattery() {
        return battery;
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }
}
