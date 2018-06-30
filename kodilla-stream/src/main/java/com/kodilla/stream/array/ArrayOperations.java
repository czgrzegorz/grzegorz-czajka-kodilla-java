package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public interface ArrayOperations {
    public static double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                 .map(n -> numbers[n])
                 .forEach(n -> System.out.println(n));

        OptionalDouble optionalAverage = IntStream.range(0, numbers.length)
                                  .map(n -> numbers[n])
                                  .average();

        double average = optionalAverage.getAsDouble();
        System.out.println(average);
        return average;
    }
}
