public class problem156 {

    public static int solution(int n)
    {
        if (n <= 3){
            return n;
        }

        int res = n;
        for (int x = 1; x <= n; x++)
        {
            int temp = x * x;
            if (temp > n)
                break;
            else
                res = Math.min(res, 1 +
                        solution(n - temp));
        }
        return res;
    }



    }

