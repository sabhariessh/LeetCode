// Last updated: 03/07/2026, 11:39:30
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
            
        }
        return 0;
    }
}