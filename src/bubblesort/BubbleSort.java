package bubblesort;


public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 3, 1, 2, 3, 3, 2, 4, 2, 5, 1, 8};

        printArray(array);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }

            }
            printArray(array);
        }

        printArray(array);
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}
