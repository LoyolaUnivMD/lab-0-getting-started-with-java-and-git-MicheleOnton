
// members : Michele Onton & Zhain Skovron

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask the user for seconds between births
        System.out.println("How many seconds between births? ");
        int births_per_second = input.nextInt();
        // Ask the user the death rate in seconds
        System.out.println("How many second between death? ");
        int deaths_per_second = input.nextInt();
        // Ask the user the rate of new immigrants in seconds
        System.out.println("How many seconds between immigrations? ");
        int immigrants_per_second = input.nextInt();
        // Ask the user for the current population
        System.out.println("What is the current population? ");
        int current_population = input.nextInt();
        // Ask the user how many years into the future the user wants to know the population
        System.out.println("How many years in the future? ");
        int num_years = input.nextInt();

        // Find how many seconds are in one year
        final int seconds_in_year = 360 * 24 * 60 * 60 ;

        // Calculate births, deaths, and immigrants per year
        int births_per_year = seconds_in_year / births_per_second ;
        int deaths_per_year = seconds_in_year / deaths_per_second ;
        int immigrants_per_year = seconds_in_year / immigrants_per_second ;

        // Calculate the future population
        int future_population = current_population + (num_years * (immigrants_per_year + births_per_year - deaths_per_year));

        // Print out final statements
        System.out.println("The US population in " + num_years + " years will be " + future_population);
        System.out.println("The population increased");


    }
}