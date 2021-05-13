package Oleh.Shevchenko;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int [] originArray = {4, 124, 23, 35, 75, 34, 64};
        quickSort(originArray, 0, originArray.length - 1);
        System.out.println(Arrays.toString(originArray));
    }
    public static void quickSort (int[]arr, int from, int to) {
        int leftPart = from;
        int rightPart = to;
        int tmp;
        int pivot = arr[(from + to) / 2];
        while (leftPart <= rightPart) {
            while (arr[leftPart] < pivot) {
                leftPart++;
            }
            while (arr[rightPart] > pivot) {
                rightPart--;
            }
            if (leftPart <= rightPart) {
                tmp = arr[leftPart];
                arr[leftPart] = arr[rightPart];
                arr[rightPart] = tmp;
                leftPart++;
                rightPart--;
            }
            if (from < rightPart) {
                quickSort(arr, from, rightPart);
            }
            if  (leftPart < to) {
                quickSort(arr, leftPart, to );
            }
        }
    }
}
