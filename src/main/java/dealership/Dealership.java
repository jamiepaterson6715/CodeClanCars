package dealership;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<IStaff> staff;

    public Dealership(String name) {
        this.name = name;
    }

    // Add Staff Member


    // Get all Staff
    public ArrayList<IStaff> getAllStaff() {
        return this.staff;
    }

}
