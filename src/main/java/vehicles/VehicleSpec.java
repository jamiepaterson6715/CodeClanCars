package vehicles;

import components.*;

public abstract class VehicleSpec {

    private Engine engine;
    private Gearbox gearbox;
    private Wheels wheels;
    private Chassis chassis;
    private Tyres tyres;
    private int price;
    private String colour;

    public VehicleSpec(Engine engine, Gearbox gearbox, Wheels wheels, Chassis chassis, Tyres tyres, int price, String colour) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.wheels = wheels;
        this.chassis = chassis;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
