package mb;

import java.util.Arrays;

public class Data {
    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 2, 6, 11, 15, 8, 17};
        maopao(arr);
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序
    public static int[] maopao(int[] arr) {

        int num = arr.length;
        int temp = 0;
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //快速排序
    public static int arg(int[] arr, int low, int hight) {
        arr[0] = arr[low];
        hight = arr.length - 1;
        int num = arr[low];
        while (low < hight) {
            while (low < hight && arr[hight] >= num) {
                --hight;
                arr[low] = arr[hight];
            }
            while (low < hight && arr[low] <= num) {
                ++low;
                arr[hight] = arr[low];
            }
            if (low == hight) {
                arr[low] = arr[0];
            }

        }
        return low;

    }
}
