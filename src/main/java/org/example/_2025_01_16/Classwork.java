package org.example._2025_01_16;

public class Classwork {
    public static void main(String[] args) {
        int a = 0; //локальная переменная метода main
        while (a <= 3) {
            System.out.println(a);
            int b = 1; //локальная переменная цикла while в методе main
            if (true) {
                System.out.println(b);
            }
            a++;
        }

        Car car1 = new Car("BMW", "x5", 1999);  //инициализация переменных экземпляра через конструктор
        Car car2 = new Car("Volvo", "xc90", 2012);
        /*car1.model = "BMC";*/

        Car car3 = new Car();
        System.out.println(car3.isMoving);

        System.out.println(car1.count);
        car1.count = 15;
        System.out.println(car2.count);

        Cat cat = new Cat();
        cat.setName("Bars").setAge(6).setWeight(5);

        int c = 654;
        System.out.println(c);
    }

    public static void doSomething() {
        System.out.println("something");
    }
}
