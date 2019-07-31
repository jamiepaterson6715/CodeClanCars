package components;

public class Tyres {


    private int width;
    private int aspectRatio;
    private int diameter;

    public Tyres(int width, int aspectRatio, int diameter) {
        this.width = width;
        this.aspectRatio = aspectRatio;
        this.diameter = diameter;
    }

    // Getters


    public int getWidth() {
        return width;
    }

    public int getAspectRatio() {
        return aspectRatio;
    }

    public int getDiameter() {
        return diameter;
    }
}
