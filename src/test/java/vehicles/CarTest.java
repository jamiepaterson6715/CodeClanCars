package vehicles;

import components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before() {
        Engine engine = new Engine(EngineType.DIESEL, 250, 140);
        Gearbox gearbox = new Gearbox(GearboxType.AUTOMATIC);
        Chassis chassis = new Chassis(ChassisType.ESTATE);
        Tyres tyres = new Tyres(235, 65, 15);
        Wheels wheels = new Wheels(15, "Alloy");

        car = new Car(engine, gearbox,  wheels, chassis, tyres, 45000, "Black");
    }

    @Test
    public void canGetPrice() {
        assertEquals(45000, car.getPrice());
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", car.getColour());
    }
}
