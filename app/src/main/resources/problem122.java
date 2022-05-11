import java.util.LinkedList;

public class problem122 {
    static void solution(LinkedList<Integer> a, int d) {
        for(int i = 0; i < d; i++) {
            a.addFirst(a.getLast());
            a.removeLast();
        }
        System.out.println(a);
    }
}
