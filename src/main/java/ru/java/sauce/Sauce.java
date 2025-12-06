package ru.java.sauce;

public class Sauce {
    private final String name;
    private final ESpices spices;

    public Sauce(String name, ESpices spices) {
        this.name = name;
        this.spices = spices;
    }

    public enum ESpices {
        VERY_SHARP {
            @Override
            public String spices() {
                return "Очень острый";
            }
        }, SHARP {
            @Override
            public String spices() {

                return "Острый";
            }
        }, NOT_SHARP {
            @Override
            public String spices() {
                return "Не острый";
            }
        };

        public abstract String spices();
    }

    @Override
    public String toString() {
        return ("Соус " + name + ":" + spices.spices());
    }
}