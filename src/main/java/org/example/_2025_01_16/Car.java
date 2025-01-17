package org.example._2025_01_16;

public class Car {
    //переменные экземпляра
    private String brand;
    private String model;
    private int age;
    boolean isMoving;

    //статическая переменная
    static int count;

    public Car() {
    }

    public Car(String brand, String model, int age) {
        this.brand = brand;
        this.model = model;
        setAge(age);
        count++;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
