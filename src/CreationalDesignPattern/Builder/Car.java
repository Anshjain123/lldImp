package CreationalDesignPattern.Builder;

public class Car {

    /**
     Mandatory attributes
     */

    private String steeringWheel;
    private String brakes;
    private String mirrors;

    /**
     * optional attributes
     */

    private String seatCover;
    private String ac;
    private String musicSystem;

    public Car(CarBuilder carBuilder) {
        this.steeringWheel = carBuilder.steeringWheel;
        this.brakes = carBuilder.brakes;
        this.mirrors = carBuilder.mirrors;

        this.seatCover = carBuilder.seatCover;
        this.ac = carBuilder.ac;
        this.musicSystem = carBuilder.musicSystem;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public String getBrakes() {
        return brakes;
    }

    public String getMirrors() {
        return mirrors;
    }

    public String getSeatCover() {
        return seatCover;
    }

    public String getAc() {
        return ac;
    }

    public String getMusicSystem() {
        return musicSystem;
    }
// we have declared this static class inside the Car class because its if Car is there then only CarBuilder should be there

    public static class CarBuilder{

        /**
         Mandatory attributes
         */

        private String steeringWheel;
        private String brakes;
        private String mirrors;

        /**
         * optional attributes
         */

        private String seatCover;
        private String ac;
        private String musicSystem;




        public CarBuilder(String steeringWheel, String brakes, String mirrors) {
            this.steeringWheel = steeringWheel;
            this.brakes = brakes;
            this.mirrors = mirrors;
        }

        public CarBuilder setSeatCover(String seatCover) {
            this.seatCover = seatCover;
            return this;
        }

        public CarBuilder setac(String ac) {
            this.ac = ac;
            return this;
        }
        public CarBuilder setmusicSystem(String musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }



        // this method will be used to create the object

        public Car build() {
            return new Car(this);
        }



    }

}
