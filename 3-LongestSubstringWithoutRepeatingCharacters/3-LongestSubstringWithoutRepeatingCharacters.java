// Last updated: 15/07/2026, 12:04:13
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        HashSet<Character> set=new HashSet<>();
        int max=0;
        int n=s.length();
        while(r<n){
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            else{
                set.add(s.charAt(r));
                max=Math.max(max,r-l+1);
                r++;
            }
        }
        return max;
    }
}