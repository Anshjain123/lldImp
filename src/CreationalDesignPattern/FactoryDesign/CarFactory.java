package CreationalDesignPattern.FactoryDesign;

public class CarFactory {

    public static Car createCar(String steeringWheel, String brakes, String mirrors, String typeOfCar) {

        if(typeOfCar.equals("Basic")) {
            return new BasicCar(steeringWheel, brakes, mirrors);
        } else if(typeOfCar.equals("sports")) {
            return new SportsCar(steeringWheel, brakes, mirrors);
        } else {
            throw new RuntimeException("This type of car is not supported yet!");
        }

    }
}
