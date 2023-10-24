public class QuickSort {
    public static int[] sort(int[] unsorted) {
        if (unsorted.length <= 1) {
            return unsorted;
        }

        int pivot = unsorted[0];
        int leftCount = 0;

        for (int i = 1; i < unsorted.length; i++) {
            if (unsorted[i] < pivot) {
                leftCount++;
            }
        }

        int[] left = new int[leftCount];
        int[] right = new int[unsorted.length - leftCount - 1];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 1; i < unsorted.length; i++) {
            if (unsorted[i] < pivot) {
                left[leftIndex++] = unsorted[i];
            } else {
                right[rightIndex++] = unsorted[i];
            }
        }

        left = sort(left);
        right = sort(right);

        int[] result = new int[unsorted.length];
        System.arraycopy(left, 0, result, 0, leftIndex);
        result[leftIndex] = pivot;
        System.arraycopy(right, 0, result, leftIndex + 1, rightIndex);

        return result;
    }
}
