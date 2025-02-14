package org.example._2025_02_13;

public class Example<T> {
    private T field1;
    public Example() {
    }

    public Example(T field1) {
        this.field1 = field1;
    }

    public T getField1() {
        return field1;
    }

    public void setField1(T t) {
        this.field1 = t;
    }

    public void print() {
        System.out.println(field1);
    }
}
