package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args){
        PoemBeautifier initiator = new PoemBeautifier();
        initiator.beautify("landscape", (text) -> "ABC "+text+" ABC");
        initiator.beautify("landscape", (text) -> text.toUpperCase());
        initiator.beautify("landscape", (text) -> text.concat(":)"));
        initiator.beautify("landscape", (text) -> text.replace("a", "A"));
    }
}
