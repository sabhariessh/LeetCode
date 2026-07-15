// Last updated: 15/07/2026, 12:03:34
class Solution {
    List<List<Integer>> output = new ArrayList<>();
    int k;
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        for(k=0;k<=n;k++){
            backTrack(0,new ArrayList<Integer>(),nums);
        }
        return output;
    }
    public void backTrack(int first,ArrayList<Integer> curr,int[] nums){
        if(curr.size()==k){
            output.add(new ArrayList(curr));
            return ;
        }
        for(int i=first;i<nums.length;i++){
            curr.add(nums[i]);
            backTrack(i+1,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
}