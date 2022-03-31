import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class problem144Test {
    @Test
    public void testSimple1()  {
        assertEquals(4,problem144.solution(new int []{1,7,8,15,17,6,8}, 3));
    }
    @Test
    public void testSimple2()  {
        assertEquals(2,problem144.solution(new int []{1,7,8,15,17,6,8}, 1));
    }
  //  @Test
   // public void testSimple4()  {
   //     assertEquals(-1,problem144.solution(new int []{1,7,8,15,17,6,8}, 18));
   // }
    @Test
    public void testSimple6()  {
        assertEquals(1,problem144.solution(new int []{9,11,9,9,15,3,2}, 2));
    }
    @Test
    public void testSimple7()  {
        assertEquals(2,problem144.solution(new int []{1,7,8,15,17,6,8}, 1));
    }
    @Test
    public void testSimple8()  {
        assertEquals(2,problem144.solution(new int []{3,3,3,2,3,3,3}, 3));
    }
    @Test
    public void testSimple3()  {
        assertEquals(-1,problem144.solution(new int []{}, 6));
    }
}
