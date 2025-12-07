package ru.java;

import ru.java.exception.Sum;
import ru.java.sauce.Sauce;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Практика ООП. Перечисления #1. Соус");
        Sauce s1 = new Sauce("Табаско", Sauce.ESpices.SHARP);
        Sauce s2 = new Sauce("1000 островов", Sauce.ESpices.NOT_SHARP);
        Sauce s3 = new Sauce("Тайский", Sauce.ESpices.VERY_SHARP);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-------------");
        System.out.println("Практика ООП. Исключения #1. NumberFormatException");
        Scanner sc = new Scanner(System.in);// Создаем сканер
        System.out.println("Сколько чисел вы хотите ввести: ");
        int count = Integer.parseInt(sc.nextLine());
        System.out.println("Введите " + count + " чисел");
        String[] numbers = new String[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextLine();
        }
        System.out.println("Наш массив" + Arrays.toString(numbers));
        double result = Sum.summator(numbers);
        System.out.println("Результат: " + result);
    }
}