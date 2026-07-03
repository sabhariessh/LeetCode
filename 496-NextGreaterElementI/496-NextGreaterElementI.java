// Last updated: 03/07/2026, 11:39:06
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
        // int[] ans=new int[nums1.length];
        // for(int i=0;i<nums1.length;i++){
        //     ans[i]=-1;
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j] ){
        //             for(int k=j+1;k<nums2.length;k++){
        //                 if(nums2[k]>nums1[i]){
        //                     ans[i]=nums2[k];
        //                     break;
        //                 }
        //             }
        //             break;
        //         }  
        //     }
        // }
        // return ans;
    }
}