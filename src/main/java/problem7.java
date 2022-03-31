import java.util.Arrays;
import java.util.stream.Stream;

public class problem7 {

    public static boolean startsWithValidTwoDigitSeq(int[] message) {
        if (message.length < 2) return false;
        if (message[0] > 2 || message[0] < 1) return false;
        if (message[0] == 2 && message[1] > 6) return false;
        return true;
    }

    public static int sum = 0;

    public static int solution(String message) {
        int[] digits = Stream.of(message.split("")).mapToInt(s -> Integer.parseInt(s)).toArray();
        sum = 0;
        sumDecodings(digits);
        return sum;
    }

    private static void sumDecodings(int[] digits) {
        if (digits.length < 1) return;
        if (digits.length < 2) {
            if (digits[0] == 0) return;
            sum += 1;
            return;
        }
        if (digits.length < 3) {
            if (startsWithValidTwoDigitSeq(digits)) sum += 1;
            sumDecodings(Arrays.copyOfRange(digits, 1, digits.length));
            return;
        }

        if (digits[0] == 0) return;

        if (startsWithValidTwoDigitSeq(digits)) {

            sumDecodings(Arrays.copyOfRange(digits, 1, digits.length));
            sumDecodings(Arrays.copyOfRange(digits, 2, digits.length));
            return;
        }

        sumDecodings(Arrays.copyOfRange(digits, 1, digits.length));
        return;
    }
}