package org.example;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected String primitiveOperation1() {
        String result = "ConcreteClass1-primitiveOperation1";
        System.out.println(result);
        return result;
    }

    @Override
    protected String primitiveOperation2() {
        String result = "ConcreteClass1-primitiveOperation2";
        System.out.println(result);
        return result;
    }
}


