package entity;

public class Car {
    private int yearModel;
    private String make;
    private EngineType engineType;
    private double mileage = 0;
    private double range = 0;

    private int speed = 0;
    private boolean running = false;

    public Car(int yearModel, String make, EngineType engineType) {
        this.yearModel = yearModel;
        this.make = make;
        this.engineType = engineType;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getMileage() {
        return mileage;
    }

    public double getRange() {
        return range;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public void start() {
        this.running = true;
        String typeOfEngine = getEngineType().toString().toLowerCase();
        System.out.println(getMake() + " car with " + typeOfEngine + " engine started.");
    }

    public void putOut() {
        this.running = false;
        this.speed = 0;
        String typeOfEngine = getEngineType().toString().toLowerCase();
        System.out.println(getMake() + " car with " + typeOfEngine + " engine has been put out.");
    }

    public void drive(int distanceInKilometres) {
        if(this.running == true) {
            this.mileage += distanceInKilometres;
            this.range -= distanceInKilometres;
            System.out.println(getMake() + " car drove a " + distanceInKilometres + "km distance.");
        } else {
            System.out.println("You have to turn on the car first.");
        }
    }

    public void fuel(int addedKmOfRange) {
        this.range += addedKmOfRange;
        System.out.println("The " + getMake() + " car has been fueled and now " +
                "it has a total range of " + getRange() + "km.");
    }
}
