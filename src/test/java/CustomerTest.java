import car.IDrive;
import car.IStart;
import car.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    Customer customer;
    ArrayList<IDrive>ownedCars;

    IDrive car;

    @Before
    public void before(){
        car = new PetrolCar(1200, "Blue");
        ownedCars = new ArrayList<>();
        customer = new Customer(50000, ownedCars);
    }

    @Test
    public void testGetMoney(){
        assertEquals(50000, customer.getMoney());
    }

    @Test
    public void testPayForCar(){
        customer.payForCar(12000);
        assertEquals(38000, customer.getMoney());
    }

    @Test
    public void testCustomerOwnedCarCount(){
        assertEquals(0, customer.getOwnedCarCount());
    }
}
