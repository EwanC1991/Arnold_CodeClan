import car.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {

    PetrolCar car;
    PetrolEngine petrolEngine;

    @Before
    public void before(){
        petrolEngine = new PetrolEngine();
        car = new PetrolCar(12000, "Red");
    }

    @Test
    public void carHasPrice(){
        assertEquals(12000, car.getPrice());
    }

    @Test
    public void carHasColour(){
        assertEquals("Red", car.getColour());
    }

    @Test
    public void carHasEngine(){
        IStart engine = car.getEngine();
        assertTrue(engine instanceof PetrolEngine);
    }
}
