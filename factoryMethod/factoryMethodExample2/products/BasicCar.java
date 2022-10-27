package factoryMethodExample2.products;

public class BasicCar implements Car{

    private static Integer count = 1;

    private final String FRAME = "Basic Frame";
    private final String ENGINE = "Basic Engine";
    private final String TRANSMISSION = "Basic Transmission";
    private final String WHEELS = "Basic Wheels";


    public String toString(){
        return String.format("===> Basic Car: %d\n" +
                        "Frame: %s\nEngine: %s\nTransmission: %s\nWheels: %s\n",
                count++, getFRAME(), getENGINE(), getTRANSMISSION(), getWHEELS());
    }

    @Override
    public String setFrame() {
        return "Setting Frame: " + getFRAME();
    }

    @Override
    public String setEngine() {
        return "Setting Engine: " + getENGINE();
    }

    @Override
    public String setTransmission() {
        return "Setting Transmission: " + getTRANSMISSION();
    }

    @Override
    public String setWheels() {
        return "Setting Wheels: " + getWHEELS();
    }


    // Getters and Setters
    public String getFRAME() {
        return FRAME;
    }

    public String getENGINE() {
        return ENGINE;
    }

    public String getTRANSMISSION() {
        return TRANSMISSION;
    }

    public String getWHEELS() {
        return WHEELS;
    }
}
