package io.codeheaven;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args)  {
        Main.each();
    }

    private static void each() {
        List<String> l = Arrays.asList(new String[]{"aaa", "b", "cccc", "DD"});

        Consumer consumer = (e) -> System.out.println(e);
        l.forEach(consumer);

        for (String s : l) {
            consumer.accept(s);
        }
    }

    private static void map() {

    }

    private static void testMethodReflection() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Test test = new Test();
        Method carMethod;

        try {
            carMethod = Test.class.getDeclaredMethod("car");
        } catch (Exception e) {
            throw e;
        }

        carMethod.invoke(test);
    }

    private static void testFunctionalInterface() {
        Action action1 = new ActionImpl();

        Action action2 = new Action() {
            @Override
            public void act() {
                System.out.println("test");
            }
        };

        Action action3 = () -> System.out.println("test");

        ActionTaker.takeAction(action1);
        ActionTaker.takeAction(action2);
        ActionTaker.takeAction(action3);
    }
}

class Test {
    public void car() {
        System.out.println("car method");
    }
}