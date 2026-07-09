// Last updated: 09/07/2026, 15:13:07
1class Solution {
2    List<List<Integer>> output = new ArrayList<>();
3    int k;
4    public List<List<Integer>> subsets(int[] nums) {
5        int n=nums.length;
6        for(k=0;k<=n;k++){
7            backTrack(0,new ArrayList<Integer>(),nums);
8        }
9        return output;
10    }
11    public void backTrack(int first,ArrayList<Integer> curr,int[] nums){
12        if(curr.size()==k){
13            output.add(new ArrayList(curr));
14            return ;
15        }
16        for(int i=first;i<nums.length;i++){
17            curr.add(nums[i]);
18            backTrack(i+1,curr,nums);
19            curr.remove(curr.size()-1);
20        }
21    }
22}