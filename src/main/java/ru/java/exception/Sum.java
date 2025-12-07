package ru.java.exception;

public class Sum {

    public static double summator(String[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                double number = Double.parseDouble(numbers[i]);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println(numbers[i]+"- не является числом");
            }
        }
        return sum;
    }
}