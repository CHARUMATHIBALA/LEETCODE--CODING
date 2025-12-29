class Solution {
    public int maxSum(int[] nums) {
        int ans = -1;
        for(int i = 0;i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                if(digitmax(nums[i])==digitmax(nums[j]))
                {
                    ans = Math.max(ans,nums[i]+nums[j]);
                }
            }
        }
     return ans;
}
   
        public int digitmax(int n)
        {
            int max = 0;
            while(n>0)
            {
                max = Math.max(max,n % 10);
                n = n /10;

            }
            return max;
        }
    }
    