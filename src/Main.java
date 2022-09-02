import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(new double[] {1, 5.2, 4, 0, -1}));
    }

        public static double sum(double[] numbers) {
            double sum = 0.0;
            for (double number : numbers) {
                sum = sum + number;
            }
            return sum;
    }
        public static double sum2 (double[] numbers) {
            return Arrays.stream(numbers).sum();
    }
}
