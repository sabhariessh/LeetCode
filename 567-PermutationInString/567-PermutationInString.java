// Last updated: 15/07/2026, 11:03:17
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n2<n1){
            return false;
        }
        int[] c1=new int[26];
        int[] c2=new int[26];
        for(int i=0;i<n1;i++){
            c1[s1.charAt(i)-'a']++;
        }
        int l=0;
        for(int r=0;r<n2;r++){
            c2[s2.charAt(r)-'a']++;
            if(r-l+1>n1){
                c2[s2.charAt(l)-'a']--;
                l++;
            }
             if(Arrays.equals(c1, c2)){
                return true;
             } 
        }
       return false; 
    }
}