package GB_HW.Java_API.Seminar3;
// Реализовать алгоритм сортировки слиянием
public class Task1 {

    public void mergeSort(int[] arr) {
        if (arr == null) {
            return;
        }
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            int[] right = new int[arr.length - mid];
            for (int i = mid; i < arr.length; i++) {
                right[i - mid] = arr[i];
            }
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
    }

    private void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 3, 1, 9, 7, 4, 5, 8, 2 };
        Task1 mergeSort = new Task1();
        mergeSort.mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
