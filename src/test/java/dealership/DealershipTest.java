package dealership;

import org.junit.Before;
import org.junit.Test;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void function() {
        dealership = new Dealership("Arnold Clark");
    }

    // Can add staff
    @Test
    public void canAddStaff() {

        dealership.addStaff();
    }

}
