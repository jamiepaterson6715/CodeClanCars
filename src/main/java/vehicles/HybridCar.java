package vehicles;

import components.*;

public class HybridCar extends VehicleSpec {

    public HybridCar(Engine engine, Gearbox gearbox, Wheels wheels, Chassis chassis, Tyres tyres, int price, String colour) {
        super(engine, gearbox, wheels, chassis, tyres, price, colour);
    }

}
