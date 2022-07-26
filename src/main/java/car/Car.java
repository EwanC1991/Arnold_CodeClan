package car;

public abstract class Car implements IDrive{

    private int price;
    private String colour;
    private IStart engine;

    public Car(int price, String colour, IStart engine){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public IStart getEngine() {
        return engine;
    }

    public String drive(){
        return "Vroom Vroom";
    }
}
