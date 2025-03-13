package org.example._2025_03_13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        OuterClass outerClass = new OuterClass("outer");
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass("nested");
        /*OuterClass.InnerClass innerClass = outerClass.new InnerClass("inner");*/

        Inner inner = outerClass.getInner();
        inner.innerMethod();
        int a = 5;

        SomeClass anonymousObject1 = new SomeClass("some field") {
            @Override
            public void doSomething() {
                System.out.println(a);
            }
        };

        SomeClass anonymousObject2 = new SomeClass("some field") {
            @Override
            public void doSomething() {
                System.out.println(a);
            }

            public void method() {
                System.out.println("do method stuff");
            }
        };

        anonymousObject1.doSomething();
        System.out.println(anonymousObject1.getClass());
        System.out.println(anonymousObject2.getClass());

        System.out.println(anonymousObject1 instanceof SomeClass);


        Class<?> myAnonymousClass = anonymousObject2.getClass();
        Method methods = myAnonymousClass.getMethod("method", null);
        methods.invoke(anonymousObject2, null);
    }
}
