package cars;

import carComponents.Battery;
import carComponents.Body;
import carComponents.Engine;
import carComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GasCarTest {

    GasCar gasCar;
    Battery battery;
    Body body;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        battery = new Battery(40);
        body = new Body("white");
        engine =new Engine("gas");
        tyres = new Tyres("summer");
        gasCar = new GasCar(battery, body, engine, tyres);
    }

    @Test
    public void hasBattery() {
        assertEquals(battery, gasCar.getBattery());
        assertEquals(body, gasCar.getBody());
        assertEquals(engine, gasCar.getEngine());
        assertEquals(tyres, gasCar.getTyres());
    }
}

