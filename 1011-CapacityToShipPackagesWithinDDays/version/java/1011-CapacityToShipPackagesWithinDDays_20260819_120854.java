// Last updated: 19/08/2026, 12:08:54
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int low=0, high=0;
4        int n=weights.length;
5        for(int i=0;i<n;i++){
6            low=Math.max(low, weights[i]);
7            high+=weights[i];
8        }
9        while(low<high){
10            int mid=(low+high)/2;
11            int requiredDays=1;
12            int currentWeight=0;
13            for(int i=0;i<n;i++){
14                if(currentWeight+ weights[i]<=mid){
15                    currentWeight+=weights[i];
16                }
17                else{
18                    requiredDays++;
19                    currentWeight=weights[i];
20                }
21            }
22            if(requiredDays<=days){
23                high=mid;
24            }
25            else{
26                low=mid+1;
27            }
28        }
29        return low;
30    }
31}