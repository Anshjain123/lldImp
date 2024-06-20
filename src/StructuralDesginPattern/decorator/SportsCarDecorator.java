package StructuralDesginPattern.decorator;

public class SportsCarDecorator extends CarDecorator {

    public SportsCarDecorator(Car car) {
        super(car);
    }

    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("including the features of sports car!");

    }
}
