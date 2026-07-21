// Last updated: 21/07/2026, 12:20:06
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int[] v=new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            int c=1;
            while(i+1<n&&arr[i]==arr[i+1]){
                c++;
                i++;
            }
            v[idx++]=c;
        }
        Arrays.sort(v,0,idx);
        for(int i=1;i<idx;i++){
            if(v[i]==v[i-1]){
                return false;
            }
        }
        return true;
    }
}