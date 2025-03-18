package org.example._2025_03_18;

import java.util.*;
import java.util.function.*;

public class Main {
    private static int k = 5;

    public static void main(String[] args) {
        final int a = 0;
        Operation operationAnonymous = new Operation() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        Comparator<Person> personComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

        Supplier<Person> personSupplier = () -> new Person("name", 15, true);
        Person person = personSupplier.get();

        Predicate<Person> personPredicate1 = p -> p.getAge() >= 18;
        Predicate<Person> personPredicate2 = p -> person.isActive();

        System.out.println(personPredicate1.test(person));
        System.out.println(personPredicate2.test(person));

        Consumer<Person> personConsumer = p -> System.out.println(p);
        personConsumer.accept(person);

        Function<Person, String> personStringFunction = p -> p.toString() + " this is person";
        System.out.println(personStringFunction.apply(person));

        UnaryOperator<Person> personUnaryOperator = p -> {
            p.setAge(20);
            return p;
        };

        BiFunction<String, Integer, Person> biFunction = (n, s) -> new Person(n, s, true);
        System.out.println(biFunction.apply("SomeName",25));

        System.out.println(personUnaryOperator.apply(person));

        Operation operationLambda1 = (j, h) -> {
            System.out.println(a);
            int m = 0;
            System.out.println(m);

            if (j % 2 == 0) {
                return j + h + m;
            } else {
                return j - h + m;
            }
        };

        Operation operationLambda2 = (j, h) -> {
            k = 10;
            return j + h;
        };

        System.out.println(k);

        MyFunction myFunction = n -> System.out.println(n);

        FunctionNoArgs functionNoArgs = () -> 5;

        System.out.println(operationLambda2.calculate(10, 5));

        System.out.println(k);


        BinaryOperator<Integer> functionGeneric1 = (x, y) -> x + y;
        System.out.println(functionGeneric1.apply(20, 30));

        BinaryOperator<String> functionGeneric2 = (x, y) -> x + y;
        System.out.println(functionGeneric2.apply("20", "30"));



        //-----------------------------------------//

        List<Person> personList = new ArrayList<>(List.of(
                new Person("1", 15, true),
                new Person("2", 20, false),
                new Person("3", 30, true),
                new Person("4", 40, false)));

        List<Person> result = new ArrayList<>();
        for (Person person1 : personList) {
            if (person1.getAge() >= 18) {
                result.add(person1);
            }
        }

        List<Person> list = personList.stream().filter(p -> p.getAge() >= 18).toList();

        System.out.println(list);

        String string = "count chars";
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
/*            charCountMap.putIfAbsent(string.charAt(i), 0);
            charCountMap.put(string.charAt(i), charCountMap.get(string.charAt(i)) + 1);*/
            charCountMap.merge(string.charAt(i), 1, (oldValue, newValue) -> oldValue + 1);
        }

        personList.forEach(p -> p.setAge(p.getAge() + 1));
    }
}
