public class problem282 {
public static boolean solution(int[] tab){
    int [] squared = new int[tab.length];
    for(int i = 0; tab.length > i; i++)
    {
        squared[i] = tab[i] * tab[i];
    }
    for(int i = 0; squared.length > i; i++){
        for(int j = 0; squared.length > j; j++){
            for(int k = 0; squared.length > k; k++){
                if(squared[i] + squared[j] == squared[k])
                    return true;
            }
        }
    }

    return false;
}

}
