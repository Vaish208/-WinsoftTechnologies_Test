import java.util.Arrays;

public class MaximumSums {
    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        System.out.println("The maximum sum is: " + maxPathSum(X, Y));
    }

    public static int maxPathSum(int[] X, int[] Y) {
        int sum1 = 0, sum2 = 0;
        int i = 0, j = 0, result = 0;

        while (i < X.length && j < Y.length) {
            if (X[i] < Y[j]) {
                sum1 += X[i++];
            } else if (X[i] > Y[j]) {
                sum2 += Y[j++];
            } else {
                result += Math.max(sum1, sum2) + X[i];
                i++;
                j++;
                sum1 = 0;
                sum2 = 0;
            }
        }

        while (i < X.length) {
            sum1 += X[i++];
        }

        while (j < Y.length) {
            sum2 += Y[j++];
        }

        result += Math.max(sum1, sum2);

        return result;
    }
}
