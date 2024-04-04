import java.util.Arrays;

public class Mergetwoarrays {
    public static void main(String[] args) {
        // Given inputs in example 
        int[] vacantCells = {0, 2, 0, 3, 0, 5, 6, 0, 0}; 
        int[] elementsToAdd = {1, 8, 9, 10, 15};

        int count = 0;
        for (int i = 0; i < vacantCells.length; i++) {
            if (vacantCells[i] != 0) {
                count++;
            }
        }

        int[] mergedArray = new int[count + elementsToAdd.length];

        int index = 0;
        for (int i = 0; i < vacantCells.length; i++) {
            if (vacantCells[i] != 0) {
                mergedArray[index++] = vacantCells[i];
            }
        }


        for (int i = 0; i < elementsToAdd.length; i++) {
            mergedArray[index++] = elementsToAdd[i];
        }

        
        Arrays.sort(mergedArray);           // Sort the mergedArray

        System.out.println(Arrays.toString(mergedArray));
    }
}