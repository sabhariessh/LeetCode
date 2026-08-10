// Last updated: 10/08/2026, 10:33:57
1public class Solution {
2public String reverseVowels(String s) {
3    if(s == null || s.length()==0) return s;
4    String vowels = "aeiouAEIOU";
5    char[] chars = s.toCharArray();
6    int start = 0;
7    int end = s.length()-1;
8    while(start<end){
9        
10        while(start<end && !vowels.contains(chars[start]+"")){
11            start++;
12        }
13        
14        while(start<end && !vowels.contains(chars[end]+"")){
15            end--;
16        }
17        
18        char temp = chars[start];
19        chars[start] = chars[end];
20        chars[end] = temp;
21        
22        start++;
23        end--;
24    }
25    return new String(chars);
26}
27}