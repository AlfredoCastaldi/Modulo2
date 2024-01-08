public class Main {
    public static void main(String[] args){
        Car newCar = new Car("punto","FIAT","AV123JJ",999);
        String model = newCar.getModel();
        String brand = newCar.getBrand();
        String plate = newCar.getIdentificationPlate();
        int cc = newCar.getCubicCapacity();

        System.out.println(model + " " + " " + brand + " " + plate + " " + cc);
    }
}
