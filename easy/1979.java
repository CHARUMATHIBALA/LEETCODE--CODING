class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        int max = 0;
        int gcd = 1 ;
        min = nums[0];
        int n = nums.length-1;
        max = nums[n];
        for(int i = 1; i <= min;i++)
        {
            if( min % i == 0 && max % i == 0)
            {
                gcd=i;
            }
        }
        return gcd;
        
    }
}