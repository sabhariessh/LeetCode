// Last updated: 09/07/2026, 14:41:25
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        StringBuilder sb=new StringBuilder();
4        List<String> ans=new ArrayList<>();
5        generate(ans,sb,0,0,n);
6        return ans;
7    }
8    public void generate(List<String> ans,StringBuilder sb,int left,int right,int n){
9        if(sb.length()==n*2){
10            ans.add(sb.toString());
11            return;
12        }
13        if(left<n){
14            sb.append("(");
15            generate(ans,sb,left+1,right,n);
16            sb.deleteCharAt(sb.length()-1);
17        }
18        if(right<left){
19            sb.append(")");
20            generate(ans,sb,left,right+1,n);
21            sb.deleteCharAt(sb.length()-1);
22        }
23    }
24}