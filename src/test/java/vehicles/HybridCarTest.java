package vehicles;

import components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before() {
        Engine engine = new Engine(EngineType.HYBRID, 250, 140);
        Gearbox gearbox = new Gearbox(GearboxType.AUTOMATIC);
        Chassis chassis = new Chassis(ChassisType.ESTATE);
        Tyres tyres = new Tyres(235, 65, 15);
        Wheels wheels = new Wheels(15, "Alloy");

        hybridCar = new HybridCar(engine, gearbox,  wheels, chassis, tyres, 45000, "Black");
    }

    @Test
    public void canGetPrice() {
        assertEquals(45000, hybridCar.getPrice());
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", hybridCar.getColour());
    }
}
