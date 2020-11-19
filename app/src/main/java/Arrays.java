public class Arrays {

    public static void main(String[] args) {

        int[] arr = {50, 39, 21, 88, 17};
        int max = 0;

        for (int value : arr) {
            if (value > max)
                max = value;
        }

        System.out.print("Maximum value in the array is " + max);
        System.out.println();

    }
}
