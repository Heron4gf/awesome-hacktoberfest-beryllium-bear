public class MergeSort {
    public static int[] sort(int[] unsorted) {
        if (unsorted.length <= 1) {
            return unsorted;
        }

        // Get the middle element
        int middle = unsorted.length / 2;
        int[] left = new int[middle];
        int[] right = new int[unsorted.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = unsorted[i];
        }

        for (int i = middle; i < unsorted.length; i++) {
            right[i - middle] = unsorted[i];
        }

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length || rightIndex < right.length) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] < right[rightIndex]) {
                    result[resultIndex++] = left[leftIndex++];
                } else {
                    result[resultIndex++] = right[rightIndex++];
                }
            } else if (leftIndex < left.length) {
                result[resultIndex++] = left[leftIndex++];
            } else if (rightIndex < right.length) {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        return result;
    }
}
