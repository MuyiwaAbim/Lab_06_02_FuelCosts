package checkInputIsInt;
import java.util.Scanner;

public class Main {
    static double gasGallons;
    static double fuelEfficiency;
    static double gallonPrice;
    static double cost;
    static double distance;



    public static void main(String[] args) {
        System.out.println("How many gallons of gas are in the tank?");
        Scanner gallons = new Scanner(System.in);
        if (gallons.hasNextDouble()) {
            gasGallons = gallons.nextDouble();
        }
        else {
            System.out.println("Invalid Input");
        }
        System.out.println("How many miles per gallon does your vehicle get?");
        Scanner efficiency = new Scanner(System.in);
        if (efficiency.hasNextDouble()) {
             fuelEfficiency = efficiency.nextDouble();
        }
        else {
            System.out.println("Invalid Input");
        }
        System.out.println("What is the price of gas per gallon?");
        Scanner price = new Scanner(System.in);
        if (price.hasNextDouble()) {
             gallonPrice = price.nextDouble();
        }
        else {
            System.out.println("Invalid Input");
        }


        double cost = (100 / fuelEfficiency) * gallonPrice;
        double distance = gasGallons * fuelEfficiency;
        System.out.println("It would cost " + cost + " dollars to drive 100 miles in your vehicle.");
        System.out.println("The car can go " + distance + " miles with the amount of gas in the tank.");
    }

}