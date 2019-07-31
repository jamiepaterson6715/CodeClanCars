package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheelsTest {

    Wheels wheels;

    @Before
    public void before() {
        wheels = new Wheels(17, "Alloy");
    }

    // Test Getters
    @Test
    public void canGetWheelDiameter() {
        assertEquals(17, wheels.getDiameter());
    }

    @Test
    public void canGetWheelType() {
        assertEquals("Alloy", wheels.getType());
    }


}
