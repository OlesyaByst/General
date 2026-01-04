package ru.java;

import ru.java.exception.Sum;
import ru.java.sauce.ESpices;
import ru.java.sauce.Sauce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

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


    List<Integer> list = IntStream.iterate(1, n -> n + 1)
            .limit(10) // N=10
            .boxed()   // Превращаем int в Integer
            .collect(java.util.stream.Collectors.toList());
    List<Integer> listNew = new ArrayList<>(list);
    for(
    int i = 0; i<listNew.size()-1;i+=2) {
        Collections.swap(listNew, i, i + 1);
    }
System.out.println("Новый лист" + listNew);
    }
}