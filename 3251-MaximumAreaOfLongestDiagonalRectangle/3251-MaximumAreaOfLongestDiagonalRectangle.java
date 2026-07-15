// Last updated: 15/07/2026, 11:02:40
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxA=0;
        int maxD=0;
        int n=dimensions.length;
        for(int i=0;i<n;i++){
            int l=dimensions[i][0];
            int b=dimensions[i][1];
            int currD=l*l+b*b;
            int currA=l*b;
            if(currD>maxD || (currD==maxD&&currA>maxA)){
                maxD=currD;
                maxA=currA;
            }
        }
        return maxA;
    }
}