class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> s = new Stack<>();
        for(String l : operations)
        {
            if(l.equals("+"))
            {
                int a = s.pop();
                int b = s.peek();
                s.push(a);
                s.push(a+b);

            }
            else if(l.equals("C"))
            {
                s.pop();
            }
            else if(l.equals("D"))
            {
                s.push(s.peek() * 2);
            }
            else{
                s.push(Integer.parseInt(l));
            }
        }
        int sum = 0;
        for(int c : s)
        {
            sum = sum+c;
        }
        return sum;
    }
}