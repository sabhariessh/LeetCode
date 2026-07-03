// Last updated: 03/07/2026, 11:39:11
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> n=new HashSet<>();
        for(int num:nums){
            n.add(num);
        }
        List<Integer> r=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!n.contains(i)){
                r.add(i);
            }
        }
        return r;
    }
}