// Last updated: 03/07/2026, 11:40:01
class Solution {
    public int majorityElement(int[] nums) {
       int c=0;
       int maj=0;
       for(int n:nums){
        if(c==0){
            maj=n;
        }
        c+=(maj==n)? 1:-1;
       } 
       return maj;
    }
}