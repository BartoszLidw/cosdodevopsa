import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class problem1Test {

    @Test
    public void testSimple(){
        assumeTrue(problem1.problem001(new int[]{1, 3, 5, 8}, 9));
    }
    @Test
    public void testSimple2()  {
        assumeFalse(problem1.problem001(new int[]{1, 3, 5, 8}, 16));
    }
    //@Test
   // public void whenDerivedExceptionThrown_thenAssertionSucceds() {
    //    Exception exception = assertThrows(SimpleExceptions.class, () -> {
     //       problem1.problem001(new int[]{}, 16);
     //   });

     //   String expectedMessage = "No elements in table";
    //    String actualMessage = exception.getMessage();

    //    assertTrue(actualMessage.contains(expectedMessage));
  //  }


}
