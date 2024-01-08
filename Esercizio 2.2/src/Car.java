public class Car {
    private String model;
    private String brand;
    private String identificationPlate;

    private int cubicCapacity;

    public Car(String model, String brand, String identificationPlate, int cubicCapacity) {
        this.model = model;
        this.brand = brand;
        this.identificationPlate = identificationPlate;
        this.cubicCapacity = cubicCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getIdentificationPlate() {
        return this.identificationPlate;
    }

    public void setIdentificationPlate(String plate) {
        this.identificationPlate = plate;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

}

