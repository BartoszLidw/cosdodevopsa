

public class problem1 {



public static boolean problem001 (int[] tab, int result) {

        int length = tab.length;

        for (int outer = 0; outer < (length - 1); ++outer) {
        for (int inner = outer + 1; inner < length; ++inner) {
        if (tab[outer] + tab[inner] == result)
        return true;
        }
        }

        return false;
        }
}
