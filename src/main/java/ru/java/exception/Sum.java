package ru.java.exception;

import java.util.Scanner;

public class Sum {
    public static String numberRegex = "-?\\d+(\\.\\d+)?"; //проверка числа

    public static void main(String[] args) {
        double sum = 0; //подсчет суммы
        for (String argument : args) { //элементы-массива
            if (argument != null && argument.matches(numberRegex)) {
                sum += Double.parseDouble(argument);
            } else {
                System.out.println("пропущено не корректное значение");
            }
        }
        System.out.println("Результат= " + sum);
    }
}