import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class problem156Test {
    @Test
    public void testSimple1()  {
        assertEquals(3,problem156.solution(6));
    }
    @Test
    public void testSimple2()  {
        assertEquals(3,problem156.solution(27));
    }
    @Test
    public void testSimple3()  {
        assertEquals(3,problem156.solution(12));
    }
}
