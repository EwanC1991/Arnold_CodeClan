import car.IDrive;
import car.IStart;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<IDrive>carStock;

    public Dealership(int till, ArrayList<IDrive>carStock){
        this.till = till;
        this.carStock = new ArrayList<>();
    }


    public int getTill() {
        return till;
    }

    public void payForCar(int price){
        till -= price;
    }

    public void addCarToStock(IDrive car){
        carStock.add(car);
    }

    public void addToTill(int cash){
        till += cash;
    }

    public int getCarStockCount(){
        return carStock.size();
    }
}
