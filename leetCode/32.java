import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> st = new Stack<>();
        
        // Base boundary for calculating valid substring lengths
        st.push(-1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    // Current ')' is unmatched; set it as the new boundary
                    st.push(i);
                } else {
                    // Valid substring length = current index - last unmatched index
                    maxLen = Math.max(maxLen, i - st.peek());
                }
            }
        }

        return maxLen;
    }
}