// Last updated: 09/07/2026, 10:31:44
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int l=0,r=0;
4        HashSet<Character> set=new HashSet<>();
5        int max=0;
6        int n=s.length();
7        while(r<n){
8            if(set.contains(s.charAt(r))){
9                set.remove(s.charAt(l));
10                l++;
11            }
12            else{
13                set.add(s.charAt(r));
14                max=Math.max(max,r-l+1);
15                r++;
16            }
17        }
18        return max;
19    }
20}