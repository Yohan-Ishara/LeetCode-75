package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 15. 3Sum
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,-2,-1};
        List<List<Integer>> arr = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (sum == 0){
                    arr.add(Arrays.asList(i,j,k));
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        System.out.println(arr);
    }
}
