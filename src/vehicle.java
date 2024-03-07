//created a class vehicle
public class vehicle {
    //create an attributes for the class
    String brand;
    String model;
    int year;
    String rentalPrice;

    //implement a method to display the vehicle information
    void vehicleInformation() {
        System.out.println("Vehicle information");
    }
}
    //vehicle(superclass extends with car(subclass)

    class car extends vehicle {
        int numberOfSeats;

        void NumberOfSeats() {
            System.out.println("Number of seats in car");
        }
    }

        //vehicle extend the motorcycle
        class motorCycle extends vehicle {
            String engineCapacity;

            void engineCapacity() {
                System.out.println("engine capacity for motorcycle");
            }
        }

