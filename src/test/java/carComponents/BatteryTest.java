package carComponents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void before(){
        battery = new Battery(40);
    }

    @Test
    public void hasVoltage() {
        assertEquals(40, battery.getVoltage(), 0.01);
    }
}
