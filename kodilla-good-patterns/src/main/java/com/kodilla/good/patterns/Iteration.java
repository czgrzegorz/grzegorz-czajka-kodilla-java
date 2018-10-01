package com.kodilla.good.patterns;

import java.util.stream.Collectors;

public class Iteration {
    public static void main(String args[]) {
        MovieStore movies = new MovieStore();
        String printout = movies.getMovies().entrySet()
                          .stream()
                          .flatMap(a -> a.getValue().stream())
                          .collect(Collectors.joining("!","",""));
        System.out.println(printout);


    }
}

