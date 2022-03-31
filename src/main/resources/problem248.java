import java.lang.Math;
public class problem248 {
    public static int solution(int a, int b)
    {
        return  (a + b + Math.abs(a - b))/2;
    }
}
