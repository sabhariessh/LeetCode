// Last updated: 03/07/2026, 11:38:33
class Solution {
    public int findJudge(int v, int[][] edges) {
        int[] in=new int[v+1];
        int[] out=new int[v+1];
        Arrays.fill(in,0);
        Arrays.fill(out,0);
        for(int i=0;i<edges.length;i++){
            out[edges[i][0]]++;
            in[edges[i][1]]++;
        }
        for(int i=1;i<=v;i++){
            if(in[i]==v-1 && out[i]==0){
                return i;
            }
        }
        return -1;
    }
}