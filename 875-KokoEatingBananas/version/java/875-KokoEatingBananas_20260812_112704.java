// Last updated: 12/08/2026, 11:27:04
1class Solution {
2    public static  int max_value(int piles[]){
3        int max=Integer.MIN_VALUE;
4        for (int i=0;i< piles.length;i++){
5            max=Math.max(piles[i],max);
6        }
7        return max;
8    }
9    public int minEatingSpeed(int[] piles, int h) {
10        int n = piles.length;
11        int ans = Integer.MIN_VALUE;
12            int low = 1;
13            int high = max_value(piles);
14        while (low <=high){
15            int mid = low + (high-low)/2;
16             int value = islessthan(piles,mid,h);
17             if (value<=h) { ans = mid;high = mid-1;}
18             else low = mid + 1;
19        }
20        return ans;
21    }
22    public static int  islessthan(int piles[],int mid,int h){
23        int count = 0;
24        for (int i = 0;i< piles.length; i++){
25              count+=Math.ceil((double) piles[i]/mid);
26        }
27        return count;
28    }
29}