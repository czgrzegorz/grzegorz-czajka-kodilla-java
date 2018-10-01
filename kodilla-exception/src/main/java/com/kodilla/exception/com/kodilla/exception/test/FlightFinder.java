package com.kodilla.exception.com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        try {
            HashMap<String,Boolean> flightViability = new HashMap<String,Boolean>();
            flightViability.put("Airport1", true);
            flightViability.put("Airport2", false);
            flightViability.put("Airport3", true);
            flightViability.put("Airport4", false);

            return flightViability.get(flight.getArrivalAirport());
        } catch (NullPointerException e){
            throw new RouteNotFoundException();
        }
    }
}

