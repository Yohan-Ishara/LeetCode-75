package twopointers;

public class Palindrome {
    public static void main(String[] args) {
        String input = "wosow";
        char[] arr = input.toCharArray();
        int start = 0;
        int end = arr.length-1;

        System.out.println(checkPalindrome(arr,start,end));
    }

    private static boolean checkPalindrome(char[] arr, int start, int end) {
        while (start<end){
            if (arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
