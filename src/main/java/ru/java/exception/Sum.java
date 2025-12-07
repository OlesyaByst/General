package ru.java.exception;

public class Sum {
    private static final String DOUBLE_REGEX = "-?\\d+(\\.\\d+)?";

    public static double summator(String[] numbers) {
        double sum = 0;
        for (String argument : numbers) { //элементы-массива
            if (argument != null && argument.matches(DOUBLE_REGEX)) {
                sum += Double.parseDouble(argument);
            } else {
                System.out.println("пропущено не корректное значение");
            }
        }
        return sum;
    }
}