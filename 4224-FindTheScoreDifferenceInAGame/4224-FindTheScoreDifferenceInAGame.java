// Last updated: 03/07/2026, 11:38:10
class Solution {
    public int scoreDifference(int[] nums) {
        int f=0;
        int s=0;
        boolean isF=true;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n%2==1){
                isF= !isF;
            }
            if(i%6==5){
                isF=!isF;
            }
            if(isF){
                f+=nums[i];
            }
            else{
                s+=nums[i];
            }
        }
        return f-s;
    }
}