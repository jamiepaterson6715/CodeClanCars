package components;

public class Gearbox {

    private GearboxType gearboxType;

    public Gearbox (GearboxType gearboxtype) {

        this.gearboxType = gearboxtype;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }
}
