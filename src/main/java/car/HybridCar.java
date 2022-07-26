package car;

public class HybridCar extends Car {

    private static IStart hybridEngine = new HybridEngine();

    public HybridCar(int price, String colour){
        super(price, colour, hybridEngine);

    }
}
