public class MotorCycle extends Vehicle {
    private boolean hasSideCar;
    private int engineCapacity;
    public MotorCycle(String make, String model, int year, double price,
                      boolean hasSideCar, int engineCapacity) {
        super(make, model, year, price);
        this.hasSideCar = hasSideCar;
        this.engineCapacity = engineCapacity;
    }
    @Override
    public void displayDetails() {
        System.out.println("Motorcycle details should be displayed");
        System.out.println("Motorcycle make:"+make);
        System.out.println("Motorcycle model:"+model);
        System.out.println("Motorcycle Year:"+year);
        System.out.println("Motorcycle Price: $"+price);
        System.out.println("Motorcycle hasSideCar:"+hasSideCar);
        System.out.println("Motorcycle engineCapacity: cc"+engineCapacity);
    }
    //Additional method
    public void calculateSpeed() {
        System.out.println("Calculate the speed of the motorcycle");
    }
}