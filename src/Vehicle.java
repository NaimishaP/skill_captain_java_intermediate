//Abstract class vehicle
public abstract class Vehicle {
    //Attributes for vehicle class
    protected String make;
    protected String model;
    protected int year;
    protected double price;

    //constructor
    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    //Abstract method
    public abstract void displayDetails();
}
