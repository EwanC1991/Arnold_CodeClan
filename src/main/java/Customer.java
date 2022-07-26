import car.Car;
import car.IDrive;
import car.IStart;
import car.PetrolCar;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<IDrive>ownedCars;

    public Customer(int money, ArrayList<IDrive>ownedCars){
        this.money = money;
        this.ownedCars = new ArrayList<>();
    }


    public int getMoney() {
        return money;
    }

    public void payForCar(int price){
        money -= price;
    }

    public int getOwnedCarCount(){
        return ownedCars.size();
    }

    public void addCar(IDrive car){
        ownedCars.add(car);
    }

    public Car changeCarType(IDrive car){
        if (car instanceof PetrolCar){
            PetrolCar petrolCar = (PetrolCar) car;
            return petrolCar;
        }

    }

    public void buyCar(IDrive car){
        payForCar(car);
        addCar(car);
    }
}
