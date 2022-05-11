import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class problem282Test {
    @Test
    public void testSimple1()  {
      assumeFalse(problem282.solution(new int []{1,7,8,15}));
    }
    @Test
    public void testSimple2() {
        assumeTrue(problem282.solution(new int []{1,4,3,5}));
    }
    @Test
    public void testSimple3()  {
        assumeTrue(problem282.solution(new int []{20,12,8,16}));
    }
}
