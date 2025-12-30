package ru.java.sauce;

public class Sauce {
    private final String name;
    private final ESpices spices;

    public Sauce(String name, ESpices spices) {
        this.name = name;
        this.spices = spices;
    }
    @Override
    public String toString() {
        return "Соус " + name + ": " + spices;
    }
}