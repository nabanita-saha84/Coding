class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            while (!st.isEmpty() && height[st.peek()] < height[i]) {
                int top = st.pop();
                if (st.isEmpty())
                    break;
                int l_max = st.peek();
                int r_max = i;
                int ht = height[top];
                int heightWeight = Math.min(height[l_max], height[r_max]) - ht;
                int width = r_max - l_max - 1;
                total += heightWeight * width;
            }
            st.push(i);
        }
        return total;
    }
}