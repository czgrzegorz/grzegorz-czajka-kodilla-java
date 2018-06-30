package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String name;
    private final String populationString;

    public Country(String name, String populationString){
        this.name = name;
        this.populationString = populationString;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = new BigDecimal(populationString);
        return peopleQuantity;
    }
}
