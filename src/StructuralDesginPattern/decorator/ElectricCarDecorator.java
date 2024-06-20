package StructuralDesginPattern.decorator;

public class ElectricCarDecorator extends CarDecorator {

    public ElectricCarDecorator(Car car) {
        super(car);
    }

    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("including the features of electric car!");

    }
}
