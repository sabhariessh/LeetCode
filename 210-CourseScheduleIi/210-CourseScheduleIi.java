// Last updated: 03/07/2026, 11:39:46
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        int inDeg[]= new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
           inDeg[prerequisites[i][1]]++;
           adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
           if(inDeg[i]==0){
                q.add(i);
            }
        }
        int count=0;
        int res[]= new int[numCourses];
        int k=0;
        while(!q.isEmpty()){
            int temp= q.poll();
            count++;
            res[k]=temp;
            k++;
            for(int i=0; i<adj.get(temp).size();i++){
                int child= adj.get(temp).get(i);
                inDeg[child]--;
                if(inDeg[child]==0){
                    q.add(child);
                }
            }
        }
        if(count!=numCourses){
            return new int[0];
        }
        int i=0,j=res.length-1;
        while(i<j){
            int temp=res[i];
            res[i]=res[j];
            res[j]=temp;
            i++;
            j--;
            }
        return res;
    }
}