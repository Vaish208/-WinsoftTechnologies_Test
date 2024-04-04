// This is user defined program 

import java.util.Arrays;
import java.util.Scanner;

public class Mergetwoarrays2 {
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

        
        int count = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] != 0) {
                count++;
            }
        }

        
        int[] merged = new int[count + Y.length];

        
        int index = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] != 0) {
                merged[index++] = X[i];
            }
        }

        
        for (int i = 0; i < Y.length; i++) {
            merged[index++] = Y[i];
        }

        
        Arrays.sort(merged);

        System.out.println(Arrays.toString(merged));
    }
}
