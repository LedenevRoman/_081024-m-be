package org.example._2025_01_14;

public class StringTransformer implements Transformer<String> {
    @Override
    public String transform(String string) {
        return string.toUpperCase();
    }
}
