package ru.java.sauce;

public enum ESpices {
    VERY_SHARP("Очень острый"),
    SHARP("Острый"),
    NOT_SHARP("Не острый");

    private final String txt;

    ESpices(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return txt;
    }
}