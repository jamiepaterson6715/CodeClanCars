package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChassisTest {

    Chassis saloon;

    @Before
    public void before() {
        saloon = new Chassis(ChassisType.SALOON);
    }

    @Test
    public void canGetChassisType() {
        assertEquals(ChassisType.SALOON, saloon.getChassisType());
    }

}
