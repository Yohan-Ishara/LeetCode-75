package twopointers;

/*
Given an integer array nums, move all 0's to the end of it
while maintaining the relative order of the non-zero elements.
*/
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int zeroCount = 0;
        int arrIndex = 0;
        int[] arr = new int[len];
        for (int num : nums) {
            if (num != 0) {
                arr[arrIndex] = num;
                arrIndex++;
            } else {
                arr[(len - 1) - zeroCount] = 0;
                zeroCount++;
            }
        }
        System.arraycopy(arr, 0, nums, 0, len);

    }
}
