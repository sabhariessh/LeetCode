// Last updated: 03/07/2026, 11:39:53
class Solution {
    public int next(int n){
        int rem=0,sq=0;
        while(n!=0){
            rem=n%10;
            sq+=rem*rem;

            n=n/10;
            //if(n==0){
                //n=ssum;
                //ssum=0;
            //}
        }
        return sq;
    }
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        int slow=n;
        int fast=next(n);
        while(slow!=fast){
            fast=next(fast);
            fast=next(fast);
            slow=next(slow);
            if(fast==1 || slow==1){
                return true;
            }
        }
        return false;

    }
}