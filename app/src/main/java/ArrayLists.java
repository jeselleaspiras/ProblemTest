import java.util.Arrays;
import java.util.HashSet;

public class ArrayLists {

    public static void main(String[] args) {

        // Find the maximum value in array without using Collection
        int[] array1 = {50, 39, 21, 88, 17};
        int max = 0;
        for (int value : array1) {
            if (value > max)
                max = value;
        }
        System.out.print("Maximum value in the array is " + max);
        System.out.println();

        // Separate zeros from non-zeros in an array
        int[] array2 = {50, 0, 39, 21, 0, 0, 88, 17};
        int index = 0;
        for (int i=0; i<array2.length; i++) {
            if (array2[i] != 0){
                array2[index] = array2[i];
                index++;
            }
        }
        while ( index < array2.length ) {
            array2[index] = 0;
            index++;
        }
        System.out.println( Arrays.toString(array2) );

        // Find intersection of two arrays in java
        int[] x = {50, 39, 21, 88, 17};
        int[] y = {21, 13, 63, 17, 46};

        HashSet<Integer> xSet = new HashSet<>();
        for (int value : x) xSet.add(value);

        System.out.print("Intersection of two arrays: ");
        for (int value : y) {
            if (xSet.contains(value))
                System.out.print(value + " ");
        }
        System.out.println();

        // Find continuous sub array whose sum is equal to given number
        int[] array3 = {42, 15, 12, 8, 6, 32};
        int given = 26;
        int sum;

        System.out.print("Continuous sub array whose sum is " + given + ": ");
        for ( int i = 0; i<array3.length; i++ ) {
            sum = array3[i];
            for (int j = i+1; j < array3.length; j++) {
                sum = sum + array3[j];
                if (sum == given){
                    for (int k = i; k <= j; k++)
                        System.out.print(array3[k]+" ");
                    System.out.println();
                }
                else if (sum > given)
                    break;
            }
        }

    }
}
