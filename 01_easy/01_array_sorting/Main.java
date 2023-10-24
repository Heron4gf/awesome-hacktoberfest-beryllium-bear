public class Main {
    public static void main(String[] args) {
        // test mergesort
        for (int i : MergeSort.sort(new int[] { 1, 3, 2 })) {
            System.out.println(i);
        }

        System.out.println("");

        // test quicksort
        for (int i : QuickSort.sort(new int[] { 3, 2, 4 })) {
            System.out.println(i);
        }
    }
}