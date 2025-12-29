import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];
        for (int c : candies) {
            if (c > max) {
                max = c;
            }
        }

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            int total = candies[i] + extraCandies;
            result.add(total >= max);
        }

        return result;
    }
}
