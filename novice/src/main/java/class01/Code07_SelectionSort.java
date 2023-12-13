package class01;

/**
 * @author yemingjie.
 * @date 2023/12/13.
 * @time 22:15.
 */
public class Code07_SelectionSort {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int max = arr.length;
        for (int i = 0; i < max; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < max; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }

    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ n-1
        // 0 ~ n-2
        int max = arr.length;
        for (int end = max - 1; end >= 0; end--) {
            // 0 ~ end上进行排序
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
            }
        }
    }

    public static void insertSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ 0
        // 0 ~ 1
        // 0 ~ 2
        int max = arr.length;
        for (int end = 1; end < max; end++) {
            int newNumIndex = end;
            while (newNumIndex - 1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
                swap(arr, newNumIndex - 1, newNumIndex);
                newNumIndex--;
            }
        }
    }

    public static void insertSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ 0
        // 0 ~ 1
        // 0 ~ 2
        int max = arr.length;
        for (int end = 1; end < max; end++) {
            // pre 新数的前一个位置
            for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr, pre, pre + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 3, 5, 1, 6, 8, 1, 3, 5, 7, 5, 6};
        printArray(arr);
        insertSort2(arr);
        printArray(arr);

    }


}
