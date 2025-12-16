class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<Integer>();
         HashSet<Integer> result = new HashSet<Integer>();
         for(int n : nums1)
         {
            a.add(n);
         }
         for(int n : nums2)
         {
            if(a.contains(n))
            {
                result.add(n);
            }

         }
         int []ans = new int[result.size()];
         int i = 0;
         for(int n : result)
         {
            ans[i]= n;
            i++;
         }
         return ans;


    }
}