package components;

public class Wheels {

    private int diameter;
    private String type;

    public Wheels(int diameter, String type) {
        this.diameter = diameter;
        this.type = type;
    }

    // Getters


    public int getDiameter() {
        return diameter;
    }

    public String getType() {
        return type;
    }
}
