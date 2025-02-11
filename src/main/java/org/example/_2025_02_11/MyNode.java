package org.example._2025_02_11;

public class MyNode {
    private Object value;
    private MyNode next;
    private MyNode previous;

    public MyNode(Object value, MyNode next, MyNode previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public MyNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getPrevious() {
        return previous;
    }

    public void setPrevious(MyNode previous) {
        this.previous = previous;
    }
}
