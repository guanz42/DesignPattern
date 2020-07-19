package strategy;

public class Sorter {

    public static <T> void SelectSort(T[] arr, MyComparator<T> comparator) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) < 0 ? j : minPos;
            }

            if (i != minPos) {
                swap(arr, i, minPos);
            }
        }
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
