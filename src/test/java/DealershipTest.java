import car.HybridCar;
import car.IDrive;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DealershipTest {

    Dealership dealership;

    ArrayList<IDrive>carStock;

    ArrayList<IDrive>ownedCars;

    IDrive car;

    Customer customer;


    @Before
    public void before(){
        carStock = new ArrayList<>();
        ownedCars = new ArrayList<>();
        customer = new Customer(40000, ownedCars);
        car = new HybridCar(20000, "Purple");
        dealership = new Dealership(60000, carStock);
    }

    @Test
    public void dealershipHasTill(){
        assertEquals(60000, dealership.getTill());
    }

    @Test
    public void dealershipHasCarStock(){
        assertEquals(0, dealership.getCarStockCount());
    }

    @Test
    public void dealershipCanPayForCar(){
        dealership.payForCar(10000);
        assertEquals(50000, dealership.getTill());
    }

    @Test
    public void dealershipCanAddCarToStock(){
        dealership.addCarToStock(car);
        assertEquals(1, dealership.getCarStockCount());
    }

    @Test
    public void dealershipCanAddToTill(){
        dealership.addToTill(10000);
        assertEquals(70000, dealership.getTill());
    }

    @Test
    public void dealershipCanSellCarToCustomer(){

        dealership.addCarToStock(car);
        customer.payForCar();

    }
}
