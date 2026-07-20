// Last updated: 20/07/2026, 14:11:29
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        Arrays.sort(arr);
4        int n=arr.length;
5        int[] v=new int[n];
6        int idx=0;
7        for(int i=0;i<n;i++){
8            int c=1;
9            while(i+1<n&&arr[i]==arr[i+1]){
10                c++;
11                i++;
12            }
13            v[idx++]=c;
14        }
15        Arrays.sort(v,0,idx);
16        for(int i=1;i<idx;i++){
17            if(v[i]==v[i-1]){
18                return false;
19            }
20        }
21        return true;
22    }
23}