// Last updated: 09/07/2026, 12:39:11
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int n1=s1.length();
4        int n2=s2.length();
5        if(n2<n1){
6            return false;
7        }
8        int[] c1=new int[26];
9        int[] c2=new int[26];
10        for(int i=0;i<n1;i++){
11            c1[s1.charAt(i)-'a']++;
12        }
13        int l=0;
14        for(int r=0;r<n2;r++){
15            c2[s2.charAt(r)-'a']++;
16            if(r-l+1>n1){
17                c2[s2.charAt(l)-'a']--;
18                l++;
19            }
20             if(Arrays.equals(c1, c2)){
21                return true;
22             } 
23        }
24       return false; 
25    }
26}