package StructuralDesginPattern.decorator;

public class BaseCar implements Car{

    @Override
    public void manufactureCar() {
        System.out.println("Manufacturing basic car");
    }
}
