package ru.java;

import ru.java.sauce.ESpices;
import ru.java.sauce.Sauce;

import java.util.Arrays;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);// Создаем сканер
        System.out.println("Сколько чисел вы хотите ввести: ");
        int count = Integer.parseInt(sc.nextLine());
        System.out.println("Введите числа");

        String[] numbers = new String[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextLine();
        }
        System.out.println("Наш массив" + Arrays.toString(args));
        Sum.main(numbers);
    }
}

class Sum {

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                double number = Double.parseDouble(args[i]);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println(args[i] + "- не является числом");
            }
        }
        System.out.println("Результат= " + sum);
    }
}