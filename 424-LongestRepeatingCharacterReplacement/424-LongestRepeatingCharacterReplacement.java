// Last updated: 15/07/2026, 11:03:28
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0;
        int maxF=0;
        int maxL=0;
        int winL=0;
        for (int right = 0; right < s.length(); right++) {
            char ch=s.charAt(right);
            char c=s.charAt(left);
            freq[ch - 'A']++;
            maxF = Math.max(maxF, freq[ch - 'A']);
            winL=right-left+1;
            if(winL-maxF>k){
                freq[c - 'A']--;
                left++;
            }
            maxL=Math.max(maxL,right-left+1);
        }
        return maxL;
    }
}