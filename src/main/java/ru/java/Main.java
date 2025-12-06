package ru.java;

import ru.java.sauce.Sauce;

public class Main {
    public static void main(String[] args) {
        Sauce s1 = new Sauce("Табаско", Sauce.ESpices.SHARP);
        Sauce s2 = new Sauce("1000 островов", Sauce.ESpices.NOT_SHARP);
        Sauce s3 = new Sauce("Тайский", Sauce.ESpices.VERY_SHARP);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}