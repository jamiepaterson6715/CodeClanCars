package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres(205, 60, 15);
    }

    @Test
    public void canGetWidth() {
        assertEquals(205, tyres.getWidth());
    }

    @Test
    public void canGetAspectRatio() {
        assertEquals(60, tyres.getAspectRatio());
    }

    @Test
    public void canGetDiameter() {
        assertEquals(15, tyres.getDiameter());
    }

}
