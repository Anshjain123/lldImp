package CreationalDesignPattern.AbstractFactory;

public class CarFactory {

    public static Car getCar(AbstractCarFactory abstractCarFactory) {
        return abstractCarFactory.createCar();
    }
}
