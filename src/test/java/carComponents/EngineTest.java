package carComponents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("electric");
    }

    @Test
    public void hasVoltage() {
        assertEquals("electric", engine.getType());
    }
}

