// Last updated: 06/07/2026, 10:29:13
1class Solution {
2    public String longestPalindrome(String s) {
3        int n=s.length();
4        boolean dp[][]=new boolean[n+1][n+1];
5        for(int i=0;i<n;i++){
6            dp[i][i]=true;
7            
8        }
9        int ans[]=new int[2];
10        for(int i=0;i<n-1;i++){
11            if(s.charAt(i)==s.charAt(i+1)){
12                dp[i][i+1]=true;
13                ans[0]=i;
14                ans[1]=i+1;
15            }
16        }
17        for(int diff=2;diff<n;diff++){
18            for(int i=0;i<n-diff;i++){
19                int j=i+diff;
20                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
21                    dp[i][j]=true;
22                    ans[0]=i;
23                    ans[1]=j;
24                }
25            }
26        }
27        int i=ans[0];
28        int j=ans[1];
29        return s.substring(i,j+1);
30    }
31}