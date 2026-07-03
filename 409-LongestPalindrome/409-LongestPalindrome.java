// Last updated: 03/07/2026, 11:39:14
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans=0;
        boolean hasOdd=false;
        for(int val:map.values()){
            if(val%2==0){
                ans+=val;
            }
            else{
                ans+=val-1;
                hasOdd=true;
            }
        }
        if(hasOdd){
            ans+=1;
        }
        return ans;
    }
}