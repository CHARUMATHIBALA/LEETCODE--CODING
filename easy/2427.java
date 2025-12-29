class Solution {
    public int commonFactors(int a, int b) {
        int min = 0;
        int count = 0;
        if ( a > b)
        {
            min = b ;
        }
        else
        {
            min = a;
        }
        for(int i = 1 ;i<=min ;i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                 count = count + 1;
            }
        }
        return count;
    }
}