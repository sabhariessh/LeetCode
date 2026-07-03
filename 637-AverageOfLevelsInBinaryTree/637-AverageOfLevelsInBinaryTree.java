// Last updated: 03/07/2026, 11:38:54
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Integer> cnt=new ArrayList<>();
        List<Double> ans=new ArrayList<>();
        dfs(root,0,cnt,ans);
        for(int i=0;i<ans.size();i++){
            ans.set(i,ans.get(i)/cnt.get(i));
        }
        return ans;
    }
    public void dfs(TreeNode root,int i,List<Integer> cnt, List<Double> sum){
        if(root==null){
            return;
        }
        if(i<sum.size()){
            sum.set(i,sum.get(i)+root.val);
            cnt.set(i,cnt.get(i)+1);
        }
        else{
            sum.add(root.val*1.0);
            cnt.add(1);
        }
        dfs(root.left,i+1,cnt,sum);
        dfs(root.right,i+1,cnt,sum);
    }
}