import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class problem214Test {
    @Test
    public void testSimple1()  {
        assertEquals(2,problem214.solution(6));
    }
    @Test
    public void testSimple2()  {
        assertEquals(8,problem214.solution(255));
    }
    @Test
    public void testSimple3()  {
        assertEquals(3,problem214.solution(167));
    }
}
