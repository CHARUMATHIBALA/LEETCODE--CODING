class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (char ss : s.toCharArray()) {
            if (ss == '#') {
                if (!stack1.isEmpty()) stack1.pop();
            } else {
                stack1.push(ss);
            }
        }

        for (char tt : t.toCharArray()) {
            if (tt == '#') {
                if (!stack2.isEmpty()) stack2.pop();
            } else {
                stack2.push(tt);
            }
        }

        return stack1.equals(stack2);
    }
}
