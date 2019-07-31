package vehicles;

import components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void setUp() throws Exception {

        Engine engine = new Engine(EngineType.ELECTRIC, 325, 170);
        Gearbox gearbox = new Gearbox(GearboxType.AUTOMATIC);
        Chassis chassis = new Chassis(ChassisType.SALOON);
        Tyres tyres = new Tyres(185, 60, 16);
        Wheels wheels = new Wheels(16, "Alloy");

        electricCar = new ElectricCar(engine, gearbox,  wheels, chassis, tyres, 49000, "Black");

    }

    @Test
    public void canGetPrice() {
        assertEquals(49000, electricCar.getPrice());
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", electricCar.getColour());
    }
}