package org.example;

public abstract class AbstractClass {

    public String templateMethod() {
        String result = primitiveOperation1();
        result += primitiveOperation2();
        return result;
    }

    protected abstract String primitiveOperation1();
    protected abstract String primitiveOperation2();
}



