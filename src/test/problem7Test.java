import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class problem7Test {
    @Test
    public void testSimple1()  {
        assertEquals(3,problem7.solution("1203"));
    }
    @Test
    public void testSimple2(){
        assertEquals(40,problem7.solution("121132221"));
    }
    @Test
    public void testSimple3()  {
        assertEquals(1,problem7.solution("81"));
    }
}