import java.util.ArrayList;
import java.util.List;

// Find common elements in three sorted arrays
public class CommonElementInThreeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        List<Integer> commonElements = findCommonElements(arr1, arr2, arr3);

        System.out.println("Common Elements: " + commonElements);
    }

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> commonElements = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            // If the current elements in all arrays are equal, add it to the result
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            // Move to the next element in the first array if it's smaller than the current elements of the other two arrays
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            // Move to the next element in the second array if it's smaller than the current elements of the other two arrays
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            // Move to the next element in the third array if it's smaller than the current elements of the other two arrays
            else {
                k++;
            }
        }

        return commonElements;
    }
}
