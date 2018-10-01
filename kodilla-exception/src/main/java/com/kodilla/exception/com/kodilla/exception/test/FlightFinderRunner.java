package com.kodilla.exception.com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        FlightFinder query1 = new FlightFinder();
        try {
            Boolean result = query1.findFlight(new Flight("Airportx","Airport5"));
            if (result == true){
                System.out.println("Destination viable");
            } else {
                System.out.println("Destination not viable");
            }

        } catch (RouteNotFoundException e) {
            System.out.println("Flight destination not found");
        }

        System.out.println("Thank you for using our flightFinder");
    }
}
