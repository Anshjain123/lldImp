package CreationalDesignPattern.AbstractFactory;

public class SportsCarFactory implements AbstractCarFactory {

    private String steeringWheel;
    private String brakes;
    private String mirrors;

    public SportsCarFactory(String steeringWheel, String brakes, String mirrors) {
        this.steeringWheel = steeringWheel;
        this.brakes = brakes;
        this.mirrors = mirrors;
    }

    @Override
    public Car createCar() {
        return new SportsCar(steeringWheel, brakes, mirrors);
    }
}
