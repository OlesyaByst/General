package ru.java.exception;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Сколько чисел вы хотите ввести?");

            try {
                int count = Integer.parseInt(sc.nextLine());
                args = new String[count];

                System.out.println("Введите числа:");
                for (int i = 0; i < count; i++) {
                    args[i] = sc.nextLine();
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: нужно было ввести целое число");
            }
        }


        double sum = 0; //подсчет суммы
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