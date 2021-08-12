import org.junit.Test;

import static org.junit.Assert.assertEquals;

class Example01 {
    public static int EXAMPLE_VALUE=6;
}
public class ExampleClass{
    @Test
    public void staticVariableAccess(){
        assertEquals(Example01.EXAMPLE_VALUE,6);

        Example01 c1=new Example01();
        Example01 c2=new Example01();

        c1.EXAMPLE_VALUE=22;
        assertEquals(Example01.EXAMPLE_VALUE,22);
        assertEquals(c2.EXAMPLE_VALUE,22);
    }
}

