class Solution {
    public int mySqrt(int x) {
        int i = 2;
        if(x == 0 || x == 1)
        {
            return x;
        }
        while( (long)i *  i <= x)
        {
            i++;
        }
        return i - 1;
    }
}