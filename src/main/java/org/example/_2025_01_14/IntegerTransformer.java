package org.example._2025_01_14;

public class IntegerTransformer implements Transformer<Integer> {
    @Override
    public Integer transform(Integer number) {
        return number * number;
    }
}
