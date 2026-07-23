// Last updated: 23/07/2026, 14:10:29
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        HashMap<Character, Integer> charIndexS = new HashMap<>();
4        HashMap<Character, Integer> charIndexT = new HashMap<>();
5        for (int i = 0; i < s.length(); i++) {
6            if (!charIndexS.containsKey(s.charAt(i))) {
7                charIndexS.put(s.charAt(i), i);
8            }
9            if (!charIndexT.containsKey(t.charAt(i))) {
10                charIndexT.put(t.charAt(i), i);
11            }
12            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
13                return false;
14            }
15        }
16        return true;        
17    }
18}