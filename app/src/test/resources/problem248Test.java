import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class problem248Test {
    @Test
    public void testSimple1() {
        assertEquals(12,problem248.solution(12,7));
    }
    @Test
    public void testSimple2()  {
        assertEquals(20,problem248.solution(19,20));
    }
    @Test
    public void testSimple3()  {
        assertEquals(9,problem248.solution(3,9));
    }
}
