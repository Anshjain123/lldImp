package StructuralDesginPattern.decorator;

public class ElonMuskCarManufacturingUnit {

    public static void main(String[] args) {

        // demand for eletric car

        Car electricCar = new ElectricCarDecorator(new BaseCar());

//        electricCar.manufactureCar();

        // demand for sports electric car


        Car sportsElectricCar = new SportsCarDecorator(new ElectricCarDecorator(new BaseCar()));
        sportsElectricCar.manufactureCar();
    }
}
