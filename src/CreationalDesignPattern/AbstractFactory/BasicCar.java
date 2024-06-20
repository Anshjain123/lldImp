package CreationalDesignPattern.AbstractFactory;

public class BasicCar implements Car {


    private String steeringWheels;
    private String brakes;
    private String mirrors;

    public BasicCar(String steeringWheels, String brakes, String mirrors) {
        this.steeringWheels = steeringWheels;
        this.brakes = brakes;
        this.mirrors = mirrors;
        System.out.println("Creating a Basic car!");
    }

    @Override
    public String getSteeringWheel() {
        return this.steeringWheels;
    }

    @Override
    public String getBrakes() {
        return this.brakes;
    }

    @Override
    public String getMirrors() {
        return this.mirrors;
    }
}
