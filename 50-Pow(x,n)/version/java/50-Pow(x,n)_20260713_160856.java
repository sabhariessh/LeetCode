// Last updated: 13/07/2026, 16:08:56
1class Solution {
2    public double myPow(double x, int n) {
3        if(n < 0){
4            n = -n;
5            x = 1 / x;
6        }
7        double pow = 1;
8        while(n != 0){
9            if((n & 1) != 0){
10                pow *= x;
11            } 
12            x *= x;
13            n >>>= 1;
14        }
15        return pow;
16    }
17}