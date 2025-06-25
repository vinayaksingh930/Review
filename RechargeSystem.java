import java.util.HashSet;
import java.util.Scanner;

public class RechargeSystem {
    static int totalAmount[] = new int[1];
    public static boolean recharge(String provider){
        Scanner sc = new Scanner(System.in);
        String s = provider.trim();
        HashSet<String> map = new HashSet<>();
        map.add("airtel");
        map.add("vi");
        map.add("bsnl");
        map.add("jio");
        if(map.contains(s)){
                System.out.println("1- $300 for 28 days with unlimited calls nad 1gb/day");
                System.out.println("1- $400 for 60 days with unlimited calls nad 2gb/day");
                System.out.println("1- $500 for 90 days with unlimited calls nad 2.5gb/day");
                System.out.println("1- $600 for 180 days with unlimited calls nad 3gb/day + HotStar");
                System.out.println("1- $700 for 365 days with unlimited calls nad 3.5gb/day + HotStar + AmazonPrime");
                System.out.println("Choose Plan.....");
                int amount = sc.nextInt();
                if(amount==300){
                    totalAmount[0]+=amount;
                    System.out.println("Successfully Recharge of $300 Enjoy Your day");
                }
                else if(amount==400){
                    totalAmount[0]+=amount;
                    System.out.println("Successfully Recharge of $400 Enjoy Your day");
                } else if (amount==500) {
                    totalAmount[0]+=amount;
                    System.out.println("Successfully Recharge of $500 Enjoy Your day");
                } else if (amount==600) {
                    totalAmount[0]+=amount;
                    System.out.println("Successfully Recharge of $600 Enjoy Your day");
                }
                else if(amount==700){
                    totalAmount[0]+=amount;
                    System.out.println("Successfully Recharge of $700 Enjoy Your day");
                }
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome sir ,Thanks for choosing our platform to recharge");
        System.out.println("Want to continue with recharge...........");
        boolean input1 = sc.nextBoolean();
        while(input1){
                System.out.println("Give me your name of Service-Provider.....");
                String provider = sc.next();
                boolean recharged = recharge(provider);
                if(recharged){
                    System.out.println();
                    System.out.println("Recharged SuccessFully");
                }
                else {
                    System.out.println("OOPs! Failed to Recharge");
                }
                System.out.println("Again want to recharge");
                input1 = sc.nextBoolean();
        }
            System.out.print(totalAmount[0]);
        }
}

