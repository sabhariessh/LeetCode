// Last updated: 15/07/2026, 12:04:03
class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        List<String> ans=new ArrayList<>();
        generate(ans,sb,0,0,n);
        return ans;
    }
    public void generate(List<String> ans,StringBuilder sb,int left,int right,int n){
        if(sb.length()==n*2){
            ans.add(sb.toString());
            return;
        }
        if(left<n){
            sb.append("(");
            generate(ans,sb,left+1,right,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(right<left){
            sb.append(")");
            generate(ans,sb,left,right+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}