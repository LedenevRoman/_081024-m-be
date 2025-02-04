package org.example._2025_01_24;

public class Cat extends Animal implements MouseCatcher, Comparable {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void sayHello() {
        System.out.println("Meow! I am a " + color + " cat. My name is " + getName());
    }

    @Override
    public void play(Creature another) {
        if (another instanceof Dog) {
            // %s - ссылка на строку
            // %d - ссылка на число
            // %n - перенос строки на следующую строку
            // System.out.println(String.format("Dog %s barks. Cat %s runs away", another.getName(), getName()));
            // System.out.printf("Dog %s barks. Cat %s runs away%n", another.getName(), getName());
            System.out.println("Dog " + another.getName() + " barks. Cat " + getName() + " runs away");
            ((Dog) another).bark();
        } else {
            super.play(another);
        }
    }

    @Override
    public void catchMouse(Mouse mouse) {
        System.out.println(getName() + " catches mouse " + mouse.getName());
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Object o) {
        Cat that = (Cat) o;
        return this.getAge() - that.getAge();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", color='" + color + '\'' +
                '}';
    }
}
