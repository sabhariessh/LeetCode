// Last updated: 03/07/2026, 11:38:04
class Solution {
    public int almostPalindromic(String s) {
       int n = s.length();
        int ans = 0;
        for(int i = 0 ; i<n ;i++){
            ans = Math.max(ans,func(s,i,i)); 
            ans = Math.max(ans,func(s,i,i+1)); 
        }
        return ans;       
    }
    public int func(String s , int l , int r){
        int n = s.length();
        while(l>=0 && r<n){
            if(s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            else{
                int val1 = func2(s,l-1,r);
                int val2 = func2(s,l,r+1);
                return Math.max(val1,val2);
            }
        }
        if(l<0 && r<n) return r-l;
        if(l>= 0 && r==n) return r-l;
        return r-l-1;
    }
    public int func2(String s , int l , int r){
        while(l>= 0 && r< s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}