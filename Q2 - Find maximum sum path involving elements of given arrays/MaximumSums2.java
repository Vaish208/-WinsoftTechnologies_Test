import java.util.Arrays;
import java.util.Scanner;

public class MaximumSums2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array X:");
        int sizeX = scanner.nextInt();
        int[] X = new int[sizeX];
        System.out.println("Enter the elements of array X:");
        for (int i = 0; i < sizeX; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of array Y:");
        int sizeY = scanner.nextInt();
        int[] Y = new int[sizeY];
        System.out.println("Enter the elements of array Y:");
        for (int i = 0; i < sizeY; i++) {
            Y[i] = scanner.nextInt();
        }

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
