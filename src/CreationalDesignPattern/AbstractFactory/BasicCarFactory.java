package CreationalDesignPattern.AbstractFactory;

public class BasicCarFactory implements AbstractCarFactory {


    private String steeringWheel;
    private String brakes;
    private String mirrors;

    public BasicCarFactory(String steeringWheel, String brakes, String mirrors) {
        this.steeringWheel = steeringWheel;
        this.brakes = brakes;
        this.mirrors = mirrors;
    }

    @Override
    public Car createCar() {
        return new BasicCar(steeringWheel, brakes, mirrors);
    }
}
