package factoryMethodExample2.products;

public class PremiumCar implements Car{

    private static Integer count = 1;
    private final String FRAME = "Premium Frame";
    private final String ENGINE = "Premium Engine";
    private final String TRANSMISSION = "Premium Transmission";
    private final String WHEELS = "Premium Wheels";


    public String toString(){
        return String.format("===> Premium Car: %d\n" +
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
