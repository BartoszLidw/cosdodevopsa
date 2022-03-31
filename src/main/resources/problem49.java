public class problem49 {
    public static int solution(int[] tab){
        int max = tab[0];
        int x = tab[0];
        for(int i = 1; i <tab.length; i++) {
        x = Math.max(tab[i], x + tab[i]);
        max = Math.max(max, x);
        }
        if(max < 0)
            max = 0;

        return max;
    }
}
