// Last updated: 24/08/2026, 12:32:14
1class Solution {
2    public int tribonacci(int n) {
3        if(n==0){
4            return 0;
5        }
6        else if(n==1||n==2){
7            return 1;
8        }
9        int t=0,a=0,b=1,c=1;
10        for(int i=3;i<=n;i++){
11            t=a+b+c;
12            a=b;
13            b=c;
14            c=t;
15        }
16        return t;
17    }
18}