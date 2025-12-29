class Solution {
    public int subtractProductAndSum(int n) {
        int pro = 1;
        int sum = 0;
        while(n > 0)
        {
            int digit = n % 10;
            n = n/10;
            sum = digit +sum;
            pro = digit * pro;

        }
        return pro - sum;
          }
}