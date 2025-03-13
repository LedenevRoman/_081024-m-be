package org.example._2025_03_11;

import java.util.Arrays;

public enum Country {
    CANADA("CAD") {
        @Override
        public void sayHello() {
            System.out.println("Hello");
        }
    },
    POLAND("PLN") {
        @Override
        public void sayHello() {
            System.out.println("Witam");
        }
    },
    GERMANY("EUR") {
        @Override
        public void sayHello() {
            System.out.println("Hallo");
        }
    },
    LAOPAPAS() {
        @Override
        public void sayHello() {
            System.out.println("ALOHA");
        }
    },
    ZIMKABU {
        @Override
        public void sayHello() {
            System.out.println("U");
        }
    };

    private String currency;

    Country(String currency) {
        this.currency = currency;
    }

    Country() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        if (!hasCurrency()) {
            this.currency = currency;
        }
    }

    public boolean hasCurrency() {
        return currency != null;
    }

    public abstract void sayHello();

    @Override
    public String toString() {
        return name() + "{" +
                "currency='" + currency + '\'' +
                '}';
    }
}
