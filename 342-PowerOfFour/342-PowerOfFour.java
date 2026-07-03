// Last updated: 03/07/2026, 11:39:26
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if((n&(n-1))==0){
            int c=0;
            while((n&1)!=1){
                n=n>>1;
                c++;
            }
            if(c%2==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}