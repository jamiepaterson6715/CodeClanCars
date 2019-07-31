package vehicles;

import components.*;

public class Car extends VehicleSpec {

    public Car(Engine engine, Gearbox gearbox, Wheels wheels, Chassis chassis, Tyres tyres, int price, String colour) {
        super(engine, gearbox, wheels, chassis, tyres, price, colour);
    }

}
