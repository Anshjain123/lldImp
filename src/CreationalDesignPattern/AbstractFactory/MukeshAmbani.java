package CreationalDesignPattern.AbstractFactory;

import CreationalDesignPattern.AbstractFactory.CarFactory;

public class MukeshAmbani {
    public static void main(String[] args) {

        Car basicCar = CarFactory.getCar(new BasicCarFactory("SW", "B", "M"));
        Car sportsCar = CarFactory.getCar(new SportsCarFactory("SW", "B", "M"));
    }
}
