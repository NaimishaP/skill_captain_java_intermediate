import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventory{
    private ArrayList<Vehicle> vehicleArr = new ArrayList<>();
    private Scanner scannerObj  = new Scanner(System.in);
    //Add vehicle in the inventory
    public void addVehicle(){
        System.out.println("Adding vehicle in the inventory:");
        System.out.println("Make:");
        String make = scannerObj.nextLine();
        System.out.println("Model:");
        String model = scannerObj.nextLine();
        System.out.println("Year:");
        int year = scannerObj.nextInt();
        System.out.println("Price:");
        double price = scannerObj.nextDouble();
        scannerObj.nextLine();
        System.out.println("Choose vehicle(1.Car or 2.MotorCycle):");
        int type = scannerObj.nextInt();
        if(type == 1){
            System.out.println("Enter num of doors: ");
            int numDoors = scannerObj.nextInt();
            scannerObj.nextLine();
            System.out.println("Enter fuel type: ");
            String fuelType = scannerObj.nextLine();
            scannerObj.nextLine();
            vehicleArr.add(new Car(make,model,year,price,numDoors,fuelType));
        }
        else if(type == 2){
            System.out.println("Enter hasSideCar: ");
            boolean hasSideCar = scannerObj.nextBoolean();
            scannerObj.nextLine(); // Consume newline after reading boolean
            System.out.println("Enter engine capacity: ");
            try {
                int engineCapacity = scannerObj.nextInt();
                scannerObj.nextLine(); // Consume newline after reading int
                vehicleArr.add(new MotorCycle(make,model,year,price,hasSideCar,engineCapacity));
                System.out.println("Added vehicles to the inventory");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for engine capacity. Please enter a valid integer.");
                scannerObj.nextLine(); // Consume the invalid input
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
    //method to display all vehicles in the inventory
    public void displayAllVehicles(){
        System.out.println("Display all vehicles: ");
        if(vehicleArr.isEmpty()){
            System.out.println("Inventory is empty");
        }
        else{
            for (Vehicle display : vehicleArr) {
                display.displayDetails();
                System.out.println();
            }
        }
    }
    public void searchVehicle() {
        System.out.println("Search the vehicle in the inventory");
        System.out.println("Make:");
        String make = scannerObj.nextLine();
        System.out.println("Model:");
        String model = scannerObj.nextLine();
        boolean found = false;
        for (Vehicle search : vehicleArr) {
            if (search.make.equalsIgnoreCase(make) && search.model.equalsIgnoreCase(model)) {
                System.out.println("vehicle found");
                // found = true;
                break;
            } else if (!found) {
                System.out.println("Vehicle not found");
            }
        }
    }
    public void updateVehicle(){
        System.out.println("Update vehicle in the inventory");
        System.out.println("Make:");
        String make = scannerObj.nextLine();
        System.out.println("Model:");
        String model = scannerObj.nextLine();
        System.out.println("Year: ");
        int year = scannerObj.nextInt();
        System.out.println("Price:");
        double price = scannerObj.nextDouble();
        scannerObj.nextLine();
        // Search for the vehicle in the inventory
        boolean found = false;
        for (Vehicle update : vehicleArr) {
            if (update.make.equalsIgnoreCase(make) && update.model.equalsIgnoreCase(model)) {
                found = true;
                System.out.print("Enter new make: ");
                String newMake = scannerObj.nextLine();
                System.out.print("Enter new model: ");
                String newModel = scannerObj.nextLine();
                System.out.println("Enter new year: ");
                int newYear = scannerObj.nextInt();
                System.out.print("Enter new price: ");
                double newPrice = scannerObj.nextDouble();
                scannerObj.nextLine(); // Consume newline

                // Update vehicle details
                update.make = newMake;
                update.model = newModel;
                update.year = newYear;
                update.price = newPrice;

                System.out.println("Details updated successfully.");
                break;
            }
            if (!found){
                System.out.println("Invalid search");
            }
        }
    }
    public void removeVehicle() {
        System.out.println("Remove vehicle from the inventory:");
        System.out.println("Make:");
        String make = scannerObj.nextLine();
        System.out.println("Model:");
        String model = scannerObj.nextLine();
        for (int i = 0; i < vehicleArr.size(); i++) {
            Vehicle remove = vehicleArr.get(i);
            if (remove.make.equalsIgnoreCase(make) && remove.model.equalsIgnoreCase(model)) {
                vehicleArr.remove(i);
                System.out.println("vehicle removed");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Display All Vehicles");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Update Vehicle");
            System.out.println("5. Remove Vehicle");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    inventory.addVehicle();
                    break;
                case 2:
                    inventory.displayAllVehicles();
                    break;
                case 3:
                    inventory.searchVehicle();
                    break;
                case 4:
                    inventory.updateVehicle();
                    break;
                case 5:
                    inventory.removeVehicle();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(6);//If user chooses option 6 then exit the program
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

//Car("Toyota", "Red", 2020);
//Car("Honda", "Blue", 2018);
//Car("Audi","A3",2024)
//Motorcycle("Harley Davidson", "Black", 2021);
//MotorCycle("Alta","white",2022);