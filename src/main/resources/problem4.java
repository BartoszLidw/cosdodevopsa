import java.util.Arrays;

public class problem4 {
    public static int solution(int[] tab){
        int min1 , min2;
        Arrays.stream(tab).sorted();
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] > 0){

                for(int y = 1 ; i < tab.length; i++){
                    if(tab[i] - y == 0)
                    y++;
                    else return y;
                }
            }

        }
        return 1;
    }
}
