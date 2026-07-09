// Last updated: 09/07/2026, 10:29:06
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int l=0,r=0;
4        HashSet<Character> set=new HashSet<>();
5        int max=0;
6        int n=s.length();
7        while(r<n){
8            while(set.contains(s.charAt(r))){
9                set.remove(s.charAt(l));
10                l++;
11            }
12            set.add(s.charAt(r));
13            max=Math.max(max,r-l+1);
14            r++;
15        }
16        return max;
17    }
18}