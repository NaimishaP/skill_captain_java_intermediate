public class Main {
    public static void main(String[] args){
        vehicle myVehicle = new vehicle();
        myVehicle.brand = "BMW";
        myVehicle.model = "3 series";
        myVehicle.year = 2021;
        myVehicle.rentalPrice = "80£/day";
        System.out.println("Vehicle Information: \nBrand: "+myVehicle.brand
        +"\nModel: "+myVehicle.model+"\nYear: "+myVehicle.year+"\nRental Price: "+
                myVehicle.rentalPrice);
        car myCar = new car();
        myCar.numberOfSeats = 5;
        System.out.println("Car with no of seats: "+myCar.numberOfSeats);
        motorCycle myMotorCycle = new motorCycle();
        myMotorCycle.engineCapacity = "1000cc";
        System.out.println("Motor cycle with engine capacity: "+
                myMotorCycle.engineCapacity);
    }

}