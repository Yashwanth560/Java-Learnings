class Vehicle {
    String vehicleType;
    String numberPlate;
    double rentalPricePerDay;

    public Vehicle(String vehicleType, String numberPlate, double rentalPricePerDay) {
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }

    public void displayDetails() {
        System.out.println("Type: " + vehicleType + ", Number Plate: " + numberPlate + ", Price/Day: $" + rentalPricePerDay);
    }
}

class Car extends Vehicle {
    int seatingCapacity;

    public Car(String numberPlate, double rentalPricePerDay, int seatingCapacity) {
        super("Car", numberPlate, rentalPricePerDay);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

class Bike extends Vehicle {
    boolean hasHelmet;

    public Bike(String numberPlate, double rentalPricePerDay, boolean hasHelmet) {
        super("Bike", numberPlate, rentalPricePerDay);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Helmet Provided: " + hasHelmet);
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    public Truck(String numberPlate, double rentalPricePerDay, double loadCapacity) {
        super("Truck", numberPlate, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("ABC123", 100, 5);
        Vehicle bike = new Bike("XYZ456", 50, true);
        Vehicle truck = new Truck("LMN789", 200, 10);

        car.displayDetails();
        System.out.println("Rental Cost for 3 days: $" + car.calculateRentalCost(3));

        bike.displayDetails();
        System.out.println("Rental Cost for 2 days: $" + bike.calculateRentalCost(2));

        truck.displayDetails();
        System.out.println("Rental Cost for 5 days: $" + truck.calculateRentalCost(5));
    }
}
