package twopointers;

import java.util.Arrays;

// 167. Two sum 2 - Input array is Sorted
public class TwoSum2InputArrayIsSorted {
    public static void main(String[] args) { 
       int[] numbers = {-1,0};
       int target = -1;

       System.out.println(Arrays.toString(getIndicesToTarget(numbers, target)));
    }

    private static int[] getIndicesToTarget(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while (start < end){

            if (numbers[start]> target){
                throw new ArithmeticException("Not found! first element is greater than target value");
            }
            if (numbers[end]>target){
                end--;
                continue;
            }

            if ((numbers[start] + numbers[end]) == target){
                return new int[]{start,end};
            }
            start++;
            end--;
        }
        return new int[]{};
    }
}
