// Full Name : Michele Onton Cueva

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for his weight in lbs
        System.out.println("What is your weight in lbs? ");
        double weight = input.nextDouble();
        // Ask the user for his height in ft
        System.out.println("What is your height in ft? ");
        double height = input.nextDouble();

        // Convert lbs to kg
        double weight_kg = weight * 0.45;

        // Convert ft to m
        double height_m = height * 0.3048;

        // Calculate Health Metrics Index (HMI)
        double hmi_value = weight_kg / Math.pow(height_m,2);

        // Print out final decisions

        if (hmi_value < 18.5) {
            System.out.println("HMI of " + hmi_value + " needs calorie increase.");
        } else if (hmi_value >= 18.5 && hmi_value < 25) {
            System.out.println("HMI of " + hmi_value + " should maintain current calorie intake.");
        } else if (hmi_value >= 25 && hmi_value < 30 ) {
            System.out.println("HMI of " + hmi_value + " should reduce calorie intake.");
        } else {
            System.out.println("HMI of " + hmi_value + " needs calorie deficit.");
        }
    }
}