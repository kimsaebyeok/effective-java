package chapter2.item2;

public class Alien {

    private final int nNumberOfEyes;
    private final int nNumberOfArms;
    private final int nNumberOfLegs;
    private final String color;

    public static class Builder {
        private int nNumberOfEyes = 0;
        private int nNumberOfArms = 0;
        private int nNumberOfLegs = 0;
        private String color = "white";

        public Builder eyes(int n) {
            nNumberOfEyes = n;
            return this;
        }

        public Builder Arms(int n) {
            nNumberOfArms = n;
            return this;
        }

        public Builder Legs(int n) {
            nNumberOfLegs = n;
            return this;
        }

        public Builder color(String c) {
            color = c;
            return this;
        }

        public Alien build() {
            return new Alien(this);
        }
    }

    private Alien(Builder builder) {
        nNumberOfArms = builder.nNumberOfArms;
        nNumberOfEyes = builder.nNumberOfEyes;
        nNumberOfLegs = builder.nNumberOfLegs;
        color = builder.color;
    }

}
