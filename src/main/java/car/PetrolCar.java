package car;

public class PetrolCar extends Car {

    private static IStart petrolEngine = new PetrolEngine();

    public PetrolCar(int price, String colour){
        super(price, colour, petrolEngine);
    }
}
