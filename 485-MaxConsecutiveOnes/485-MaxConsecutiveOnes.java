// Last updated: 03/07/2026, 11:39:09
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int c=0;
        for(int num:nums){
            if(num==1){
                c+=1;
                max=Math.max(max,c);
            }
            else{
                c=0;
            }
        }
        return max;
    }
}