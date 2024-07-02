package Sortable;

public class QuickSort implements Sortable {
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length -1);
    }

    private void quickSort(int[] arr, int first, int last) {
        if (last > first) {
            int pivot = divide(arr, first, last);
            quickSort(arr, first, pivot - 1);
            quickSort(arr, pivot + 1, last);
        }
    }

    private int divide(int[] arr, int first, int last) {
        int pivot, left, right = last;
        left = first + 1;
        pivot = arr[first];
        while (left <= right) {
            while (left <= pivot && arr[left] <= pivot) left ++;
            while(right >= left && arr[right] >= pivot) right --;
            if (left < right) {
                switchArr(arr, first, right);
            }
        }
        return right;
    }

    private void switchArr(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
