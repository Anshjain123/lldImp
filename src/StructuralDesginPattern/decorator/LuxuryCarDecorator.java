package StructuralDesginPattern.decorator;

public class LuxuryCarDecorator extends CarDecorator {

    public LuxuryCarDecorator(Car car) {
        super(car);
    }

    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("including the features of luxury car!");

    }
}
