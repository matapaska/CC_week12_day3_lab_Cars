package cars;

import carComponents.Battery;
import carComponents.Body;
import carComponents.Engine;
import carComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Battery battery;
    Body body;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        battery = new Battery(40);
        body = new Body("white");
        engine =new Engine("electric");
        tyres = new Tyres("summer");
        electricCar = new ElectricCar(battery, body, engine, tyres);
    }

    @Test
    public void hasBattery() {
        assertEquals(battery, electricCar.getBattery());
        assertEquals(body, electricCar.getBody());
        assertEquals(engine, electricCar.getEngine());
        assertEquals(tyres, electricCar.getTyres());
    }
}
