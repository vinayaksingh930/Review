import java.util.Scanner;

public class ParkingLotSimulation {
    private static final int CAPACITY = 6;
    private static String[] parkingSlots = new String[CAPACITY];
    private static int parkedCars = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nParking Lot Simulation");
            System.out.println("1. Park the car");
            System.out.println("2. Unpark the car");
            System.out.println("3. Show capacity/vacancy");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    parkCar(scanner);
                    break;
                case 2:
                    unparkCar(scanner);
                    break;
                case 3:
                    showCapacity();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void parkCar(Scanner scanner) {
        if (parkedCars == CAPACITY) {
            System.out.println("Parking lot is full. Exiting program.");
            System.exit(0);
        }
        System.out.print("Enter car license plate to park: ");
        String licensePlate = scanner.nextLine();

        for (int i = 0; i < CAPACITY; i++) {
            if (parkingSlots[i] == null) {
                parkingSlots[i] = licensePlate;
                parkedCars++;
                System.out.println("Car parked at slot " + (i + 1));
                return;
            }
        }
    }

    private static void unparkCar(Scanner scanner) {
        if (parkedCars == 0) {
            System.out.println("Parking lot is empty.");
            return;
        }
        System.out.print("Enter car license plate to unpark: ");
        String licensePlate = scanner.nextLine();

        for (int i = 0; i < CAPACITY; i++) {
            if (licensePlate.equals(parkingSlots[i])) {
                parkingSlots[i] = null;
                parkedCars--;
                System.out.println("Car unparked from slot " + (i + 1));
                return;
            }
        }
        System.out.println("Car not found in the parking lot.");
    }

    private static void showCapacity() {
        System.out.println("Total capacity: " + CAPACITY);
        System.out.println("Occupied slots: " + parkedCars);
        System.out.println("Vacant slots: " + (CAPACITY - parkedCars));
        System.out.print("Occupied slots detail: ");
        for (int i = 0; i < CAPACITY; i++) {
            if (parkingSlots[i] != null) {
                System.out.print("[" + (i + 1) + ": " + parkingSlots[i] + "] ");
            }
        }
        System.out.println();
    }
}
