package prefixsum;



// 303. Prefix sum array immutable
public class RangeSumQueryImmutable {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        System.out.println(sumRange(0,4,nums));
    }

    private static int sumRange(int left, int right, int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        if(left != 0) return nums[right];
        return nums[right] - nums[left-1];

    }
}
