package car;

public class ElectricCar extends Car {

    private static IStart electricEngine = new ElectricEngine();

    public ElectricCar(int price, String colour){
        super(price, colour, electricEngine);

    }
}
