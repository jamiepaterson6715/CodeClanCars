package components;

public class Engine {

    private EngineType enginetype;
    private int bhp;
    private int emissions;

    public Engine(EngineType enginetype, int bhp, int emissions) {
        this.enginetype = enginetype;
        this.bhp = bhp;
        this.emissions = emissions;
    }

    public EngineType getEnginetype() {
        return enginetype;
    }

    public int getBhp() {
        return bhp;
    }

    public int getEmissions() {
        return emissions;
    }
}
