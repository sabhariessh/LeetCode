// Last updated: 17/08/2026, 16:08:32
1class Solution {
2    public String reorganizeString(String S) {
3        Map<Character, Integer> map = new HashMap<>();
4        for (char c : S.toCharArray()) {
5            int count = map.getOrDefault(c, 0) + 1;
6            if (count > (S.length() + 1) / 2) return "";
7            map.put(c, count);
8        }
9        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
10        for (char c : map.keySet()) {
11            pq.add(new int[] {c, map.get(c)});
12        }
13        StringBuilder sb = new StringBuilder();
14        while (!pq.isEmpty()) {
15            int[] first = pq.poll();
16            if (sb.length() == 0 || first[0] != sb.charAt(sb.length() - 1)) {
17                sb.append((char) first[0]);
18                if (--first[1] > 0) {
19                    pq.add(first);
20                }
21            } else {
22                int[] second = pq.poll();
23                sb.append((char) second[0]);
24                if (--second[1] > 0) {
25                    pq.add(second);
26                }
27                pq.add(first);
28            }
29        }
30        return sb.toString();
31    }
32}