package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearboxTest {

    Gearbox gearbox;

    @Before
    public void setUp() throws Exception {
       gearbox = new Gearbox(GearboxType.AUTOMATIC);
    }

    @Test
    public void canGetGearboxType() {
        assertEquals(GearboxType.AUTOMATIC, gearbox.getGearboxType());
    }



}
