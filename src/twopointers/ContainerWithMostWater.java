package twopointers;

//11. Container with most water
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int start = 0;
        int end = height.length-1;

        int mostWaterContainer = 0;
        while (start<end){
            int minHeight = Math.min(height[start],height[end]);
            int width = end - start;
            int currentContainer = minHeight * width;
            mostWaterContainer = Math.max(mostWaterContainer, currentContainer);
            if (height[start] < height[end]){
                start++;
            }else {
                end--;
            }
        }
        System.out.println(mostWaterContainer);

    }
}
