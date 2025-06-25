import java.util.Scanner;
public class ParkingLotSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parked = 0;
        int totalParking = 6;

        do {
            System.out.println("\n 1:Park, 2:UnPark, 3: know occupancy/capacity, 4:exit :");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    if (parked < totalParking) {
                        parked++;
                        System.out.println("Car parked. Current occupancy: " + parked);
                    } else {
                        System.out.println("Parking full. No space available.");
                    }
                    break;

                case 2:
                    if (parked > 0) {
                        parked--;
                        System.out.println("Car unparked. Current occupancy: " + parked);
                    } else {
                        System.out.println("No cars to unpark.");
                    }
                    break;

                case 3:
                    System.out.println("Current occupancy: " + parked);
                    System.out.println("Current vacancy: " + (totalParking - parked));
                    break;

                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }while(true);
    }
}
