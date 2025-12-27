class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int max = 0;
        for(int n : gain)
        {
            current = current + n;
            if(current > max){
                max = current;
            }
        }
        return max;
    }
}