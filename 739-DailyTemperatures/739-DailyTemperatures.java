// Last updated: 03/07/2026, 11:38:42
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        int cday;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            cday=temperatures[i];
            while(st.size()>0&&temperatures[st.peek()]<cday){
                int pday=st.pop();
                ans[pday]=i-pday;
            }
            st.push(i);
        }
        return ans;
    }
}