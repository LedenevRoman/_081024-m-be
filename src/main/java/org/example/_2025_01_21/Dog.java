package org.example._2025_01_21;

public class Dog extends Animal implements MyInterface, MyInterface2 {
    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public Dog(String name) {
        super(name);
    }

    public void voice() {
        System.out.println(getName() + " говорит гав");
    }

    @Override
    public void myMethod1() {

    }

    @Override
    public void myMethod2() {

    }

    @Override
    public void myMethod3() {

    }

    @Override
    public void myMethod4() {

    }
}
