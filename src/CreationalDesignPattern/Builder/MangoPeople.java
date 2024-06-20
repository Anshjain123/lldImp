package CreationalDesignPattern.Builder;

public class MangoPeople {
    public static void main(String[] args) {

        Car car = new Car.CarBuilder("SW", "B", "M").setSeatCover("seatcover").setac("ac").setmusicSystem("musicsystem").build();

        System.out.println(car.getAc());

    }
}
