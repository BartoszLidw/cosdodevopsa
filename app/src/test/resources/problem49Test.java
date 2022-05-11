import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class problem49Test {
    @Test
    public void testSimple1() {
        assertEquals(31,problem49.solution(new int []{1,7,8,15}));
    }
    @Test
    public void testSimple2(){
        assertEquals(0,problem49.solution(new int []{-1,-1,-2,-3}));
    }
    @Test
    public void testSimple3()  {
        assertEquals(6,problem49.solution(new int []{1,-1,-3,6}));
    }
}
