package Else;

import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 7. 11..
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 20 - i;
        }
        int A[];
        System.out.println(Arrays.toString(arr));
        A = mergeSort(arr);
        System.out.println(Arrays.toString(A));
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            int[] A = new int[2];
            A[0] = arr[0];
            A[1] = Integer.MAX_VALUE;
            return A;
        }
        int[] L;
        int[] R;
        int[] arrL;
        int[] arrR;

        int start = 0;
        int mid = arr.length / 2;
        int end = arr.length;

        arrL = Arrays.copyOfRange(arr, start, mid);
        arrR = Arrays.copyOfRange(arr, mid, end);

        L = mergeSort(arrL);
        R = mergeSort(arrR);


        int[] A = new int[end - start + 1];
        int i = 0;
        int j = 0;
        for (int k = 0; k < A.length - 1; k++) {
            if (L[i] < R[j]) {
                A[k] = L[i++];
            } else {
                A[k] = R[j++];
            }
        }
        A[A.length - 1] = Integer.MAX_VALUE;
        return A;
    }
}
