import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

class problem122Test {

LinkedList<Integer> numbers = new LinkedList<>();
    @BeforeEach
void fillLinkedList() {
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
}
    @Test
    void testSimple1() {
        problem122.solution(numbers, 2);
        Integer[] numbers2 = numbers.toArray(new Integer[0]);
        Integer[] solution = {5, 6, 1, 2, 3, 4};
        assumeTrue(Arrays.equals(solution, numbers2));
    }
}