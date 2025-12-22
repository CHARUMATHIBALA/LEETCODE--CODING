
class Solution {
    public int findLucky(int[] arr) {

        int[] count = new int[501];

        // frequency count
        for (int num : arr) {
            count[num]++;
        }

        int lucky = -1;

        // check lucky number
        for (int i = 1; i <= 500; i++) {
            if (count[i] == i) {
                lucky = i;   // largest lucky automatically update
            }
        }

        return lucky;
    }
}