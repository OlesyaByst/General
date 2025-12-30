package ru.java.sauce;

public class ESpices {
    private String txt;
    public static final ESpices VERY_SHARP = new ESpices("Очень острый");
    public static final ESpices SHARP = new ESpices("Острый");
    public static final ESpices NOT_SHARP = new ESpices("Не острый");

    private ESpices(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return txt;
    }
}
