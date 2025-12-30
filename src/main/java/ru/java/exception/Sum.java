package ru.java.exception;

import java.util.Scanner;

public class Sum {
    public static String numberRegex = "-?\\d+(\\.\\d+)?"; //проерка числа

    public static void main(String[] args) {
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Сколько чисел вы хотите ввести?");
            String inputCount = sc.nextLine();
            if (inputCount.matches("\\d+")) {
                int elementsCount = Integer.parseInt(inputCount);
                args = new String[elementsCount];

                for (int i = 0; i < elementsCount; i++) {
                    System.out.println("Введите число номер " + (i + 1) + ":");
                    args[i] = sc.nextLine();
                }
            } else {
                System.out.println("Ошибка: введено не число.");
                return;
            }
        }


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