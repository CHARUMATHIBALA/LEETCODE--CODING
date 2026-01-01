class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum1 = 0;
        int sum2 = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum1 = sum1 + mat[i][i];              
            sum2 = sum2 + mat[i][n - 1 - i];      

            if (n % 2 == 0) {           
                sum = sum1 + sum2;
            } else {
                sum = sum1 + sum2 - mat[n / 2][n / 2];
            }
        }
        return sum;
    }
}
