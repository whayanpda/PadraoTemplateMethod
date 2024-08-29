import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMethod {

    @Test
    public void testConcreteClass1TemplateMethod() {
        ConcreteClass1 class1 = new ConcreteClass1();
        String expectedOutput = "ConcreteClass1-primitiveOperation1ConcreteClass1-primitiveOperation2";
        String actualOutput = class1.templateMethod();

        assertEquals(expectedOutput, actualOutput, "O resultado do método templateMethod de ConcreteClass1 não é o esperado.");
    }

    @Test
    public void testConcreteClass2TemplateMethod() {
        ConcreteClass2 class2 = new ConcreteClass2();
        String expectedOutput = "ConcreteClass2-primitiveOperation1ConcreteClass2-primitiveOperation2";
        String actualOutput = class2.templateMethod();

        assertEquals(expectedOutput, actualOutput, "O resultado do método templateMethod de ConcreteClass2 não é o esperado.");
    }
}
