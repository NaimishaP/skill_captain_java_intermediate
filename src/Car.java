public class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    public Car(String make, String model, int year, double price,
               int numDoors, String fuelType) {
        super(make, model, year, price);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car details should be displayed");
        System.out.println("Car make:"+make);
        System.out.println("Car model:"+model);
        System.out.println("Car Year:"+year);
        System.out.println("Car Price: $"+price);
        System.out.println("car no.of doors:"+numDoors);
        System.out.println("Car fuelType:"+fuelType);
    }
    //Additional method
    public void calculateMileage() {
        System.out.println("Calculate the car mileage");
    }
}