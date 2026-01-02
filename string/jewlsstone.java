class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> s= new HashSet<>();
        int count = 0;
        for(int i = 0 ;i< jewels.length();i++)
        {
            s.add(jewels.charAt(i));
        }
        for(int j = 0 ; j< stones.length();j++)
        {
           if( s.contains(stones.charAt(j))){
            count++;
           }
        }
        return count;
    }
}