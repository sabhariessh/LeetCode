// Last updated: 03/07/2026, 11:40:37
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int l=0,r=m*n-1;
        while(l<=r){
            int mid=(r+l)/2;
            int val=matrix[mid/m][mid%m];
            if(val==target){
                return true;
            }
            if(val<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}