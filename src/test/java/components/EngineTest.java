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

}
