package ru.java;

import ru.java.exception.Sum;
import ru.java.sauce.ESpices;
import ru.java.sauce.Sauce;

public class Main {
    public static void main(String[] args) {
        System.out.println("Практика ООП. Перечисления #1. Соус");
        Sauce s1 = new Sauce("Табаско", ESpices.NOT_SHARP);
        Sauce s2 = new Sauce("1000 островов", ESpices.SHARP);
        Sauce s3 = new Sauce("Тайский", ESpices.VERY_SHARP);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-------------");
        System.out.println("Практика ООП. Исключения #1. NumberFormatException");
        Sum.main(args);
    }
}