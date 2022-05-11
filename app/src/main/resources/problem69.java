public class problem69 {
    public static int solution(int[] arr) {
        if (arr.length < 3)
            return -1;


        int max_product = -10000;

        for (int i = 0; i < arr.length - 2; i++)
            for (int j = i + 1; j < arr.length - 1; j++)
                for (int k = j + 1; k < arr.length; k++)
                    max_product = Math.max(max_product,
                            arr[i] * arr[j] * arr[k]);

        return max_product;
    }
}
