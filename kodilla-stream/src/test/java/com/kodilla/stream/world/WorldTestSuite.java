package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("Europe");
        Country spain = new Country("Spain","46");
        Country italy = new Country("Italy","60");
        europe.getCountries().add(spain);
        europe.getCountries().add(italy);

        Continent asia = new Continent("Asia");
        Country china = new Country("China","1300");
        Country india = new Country("India","1300");
        asia.getCountries().add(china);
        asia.getCountries().add(india);

        Continent northamerica = new Continent("North America");
        Country usa = new Country("USA","325");
        Country canada = new Country("Canada","36");
        northamerica.getCountries().add(usa);
        northamerica.getCountries().add(canada);

        World theWorld = new World();
        theWorld.getContinents().add(europe);
        theWorld.getContinents().add(asia);
        theWorld.getContinents().add(northamerica);

        //When
        BigDecimal totalPeopleQuantity = theWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantity = new BigDecimal("3067");
        Assert.assertEquals(expectedQuantity, totalPeopleQuantity);
    }
}
