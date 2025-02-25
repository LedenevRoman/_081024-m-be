package org.example._2025_01_14;

public class TransformSystem {

    public static <T> T transform(T t) {
        if (t.getClass().equals(String.class)) {
            return (T) ((String) t).toUpperCase();
        } else if (t instanceof Number) {
            return (T) Long.valueOf(((Number) t).longValue() * ((Number) t).longValue());
        }
        return null;
    }
}
