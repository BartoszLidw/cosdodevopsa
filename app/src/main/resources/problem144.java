public class problem144 {
    public static int solution(int tab[], int n){
        for(int i = 1; i < tab.length ; i++){
            if((n - i) >= 0) {
                if(tab[n] < tab [n - i]){
                    return (n - i);
                }
            }
            if(n+1 <tab.length) {
                if(tab[n] < tab [n + i]){
                    return (n + i);
                }
            }
        }
        return -1;

    }
}
