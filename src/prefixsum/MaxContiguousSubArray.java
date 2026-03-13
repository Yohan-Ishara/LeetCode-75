package prefixsum;

import java.util.Arrays;
import java.util.List;

// 525. Contiguous Array
public class MaxContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1};

        [1,0,1,0,0,0,1]
        1 -1 1 -1 -1 -1 1
            1 0 1 0 -1 -2 -1


        -1,1,-1,1,1
                -1 0 -1 0 1
        System.out.println(findMaxLength(arr));
    }

    private static int findMaxLength(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0){
                arr[i] = -1;
            }
            arr[i] = arr[i-1] + arr[i];
        }
        return 0;
    }
}
