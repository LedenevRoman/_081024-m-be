package org.example._2025_03_13;

import java.util.ArrayList;
import java.util.List;

public class OuterClass {
    private static String outerStaticField = "outer static field";
    private String outerField;

    public OuterClass(String outerField) {
        this.outerField = outerField;
    }

    public static void outerStaticMethod() {
        //обращение к полям и методам внешнего класса
        System.out.println(outerStaticField);

        //обращение к полям и методам вложенного статического класса
        System.out.println(NestedClass.nestedStaticField);
        NestedClass.nestedStaticMethod();

        NestedClass nestedClass = new NestedClass("nested field");
        System.out.println(nestedClass.nestedField);
        nestedClass.nestedMethod();

        //обращение к полям и методам внутреннего класса
        System.out.println(InnerClass.innerStaticField);
        InnerClass.innerStaticMethod();

        //нельзя
//        InnerClass innerClass = new InnerClass();
    }

    public void outerMethod() {
        //обращение к полям и методам внешнего класса
        System.out.println(outerStaticField);
        System.out.println(outerField);
        outerStaticMethod();

        //обращение к полям и методам внутреннего класса
/*        InnerClass innerClass = new InnerClass("inner");
        System.out.println(innerClass.innerField);
        innerClass.innerMethod();*/
    }

    public InnerClass getInner() {
        return new InnerClass("inner");
    }

    public void methodLocalClassExample() {
        final int localOuter1 = 1;
        int localOuter2 = 5;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);

        class LocalClass {
            private static String localStaticField = "local static field";
            private String localField;

            public LocalClass(String localField) {
                this.localField = localField;
            }

            private static void localStaticMethod() {
                //нельзя
//                System.out.println(localOuter1);
            }

            private void localMethod() {
                System.out.println(localOuter1);
                System.out.println(localOuter2);
                System.out.println(list);
            }
        }

        LocalClass localClass1 = new LocalClass("local1");
        LocalClass localClass2 = new LocalClass("local2");
        System.out.println(LocalClass.localStaticField);
        LocalClass.localStaticMethod();

        System.out.println(localClass1.localField);
        localClass1.localMethod();
    }

    public void methodAnonymousClassExample() {
        final int localOuter1 = 1;
        int localOuter2 = 5;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);

        SomeClass anonymousClass = new SomeClass("some field") {
            @Override
            public void doSomething() {
                System.out.println("Something else can be done");
            }
        };


    }


    public static class NestedClass {
        private static String nestedStaticField = "nested static field";
        private String nestedField;

        public NestedClass(String nestedField) {
            this.nestedField = nestedField;
        }

        private static void nestedStaticMethod() {
            //обращение к полям и методам внешнего класса
/*            System.out.println(outerStaticField);*/
/*            OuterClass.outerStaticMethod();*/

/*            OuterClass outerClass = new OuterClass("outer field");
            System.out.println(outerClass.outerField);
            outerClass.outerMethod();*/

        }

        private void nestedMethod() {

        }
    }

    public class InnerClass implements Inner {
        private static String innerStaticField = "inner static field";
        private String innerField;

        public InnerClass(String innerField) {
            this.innerField = innerField;
        }

        public static void innerStaticMethod() {
            //обращение к полям и методам внешнего класса
/*            System.out.println(outerStaticField);
            OuterClass.outerStaticMethod();*/

        }

        @Override
        public void innerMethod() {
            System.out.println(outerField);
            outerMethod();
        }
    }
}
