package arrayandstring;

import java.util.ArrayList;
import java.util.List;

/*We are given an integer array candies, where each candies[i] represents the number of
candies the i th kid has, and an integer extraCandies, denoting the number of extra candies that
you have.

Our task is to return a boolean array result of length n,
where result[i] is true if, after giving the i
th kid all the extraCandies, they will have the greatest number of
candies among all the kids, or false otherwise.*/

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 6;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            if (maxCandies < candy) {
                maxCandies = candy;
            }
        }

        for (int candy : candies) {
            int totalCandiesIthHave = candy + extraCandies;
            if (totalCandiesIthHave >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
