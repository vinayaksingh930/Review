package ParkingLotSimulation;
import java.util.*;

class ParkingFullException extends Exception {
    public ParkingFullException(String message) {
        super(message);
    }
}
public class Parking{
    static int MAX_CAPACITY=6;
    static String[] parkingLot = new String[MAX_CAPACITY];
    static int count = 0;

    public static void parkCar(String carNumber) throws ParkingFullException {
        if (count >= MAX_CAPACITY) {
            throw new ParkingFullException("Parking lot is full! Cannot park car: " + carNumber);
        }
        parkingLot[count] = carNumber;
        count++;
        System.out.println("Car " + carNumber + " parked successfully.");
    }
    public static void unparkCar(String carNumber){
        boolean found=false;
        for(int i=0;i<count;i++){
            if(parkingLot[i].equals(carNumber)){
                found=true;
                for(int j=i;j<count;j++){
                    parkingLot[j]=parkingLot[j+1];

                }
                parkingLot[count-1]=null;
                count--;
                System.out.println("Car unparked successfully");
            }
        }
        if(!found){
            System.out.println("Car number"+carNumber+" not found in the parking lot");
        }
        
    }
    public static void displayParkingLot() {
        System.out.println("Current cars in parking:");
        if (count == 0) {
            System.out.println("Parking lot is empty.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + parkingLot[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean run=true;
        while(run){
            System.out.println("-----Car parking system-----");
            System.out.println("1 for Park Car");
            System.out.println("2 for Unpark Car");
            System.out.println("3 for View parking lot");
            System.out.println("4 for Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if(choice==1){
                System.out.println("Press 1 to park the car");
                String car=sc.nextLine();
                try {
                    parkCar(car);
                } catch (ParkingFullException e) {
                    System.out.println(e.getMessage());
                }
            }else if(choice==2){
                System.out.println("Press 2 to unpark the car");
                String carUnpark=sc.nextLine();
                unparkCar(carUnpark);
            }else if(choice==3){
                displayParkingLot();
            }else if(choice==4){
                System.out.println("Exit the car parking");
                run=false;
            }else{
                System.out.println("Car cannot be parked at this time");
            }
        }
    }


    
    }


    
