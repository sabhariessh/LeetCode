// Last updated: 03/07/2026, 11:38:20
class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visit,int s, int d){
        visit[s]=true;
        for(int i=0;i<adj.get(s).size();i++){
            int child=adj.get(s).get(i);
            if(child==d){
                return true;
            }
            if(!visit[child]){
                if(dfs(adj,visit,child,d)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination){
            return true;
        }
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visit=new boolean[n];
        Arrays.fill(visit,false);
        return dfs(adj,visit,source,destination);
    }
}