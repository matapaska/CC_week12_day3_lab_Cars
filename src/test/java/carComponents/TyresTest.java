package carComponents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("winter");
    }

    @Test
    public void hasVoltage() {
        assertEquals("winter", tyres.getType());
    }
}


