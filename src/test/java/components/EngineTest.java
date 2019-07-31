package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(EngineType.DIESEL, 209, 130);
    }

    // Test Getters
    @Test
    public void canGetEngineType() {
        assertEquals(EngineType.DIESEL, engine.getEnginetype());
    }

    @Test
    public void canGetEngineBhp() {
        assertEquals(209, engine.getBhp());
    }

    @Test
    public void canGetEmissions() {
        assertEquals(130, engine.getEmissions());
    }

}
