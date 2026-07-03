// Last updated: 03/07/2026, 11:38:47
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int ps[]=new int[n];
        ps[0]=nums[0];
        //int j=1;
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+nums[i];
            
            //System.out.println(ps[i]);
            //j++;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            if(i==0){
                leftSum=0;
            }else{
                leftSum=ps[i-1];
            }
            
            int rightSum=ps[n-1]-ps[i];
            if(leftSum==rightSum){
                return i;
            }
        }return -1;
    }
} 