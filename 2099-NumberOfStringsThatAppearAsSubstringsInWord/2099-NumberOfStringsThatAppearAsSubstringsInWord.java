// Last updated: 03/07/2026, 11:38:23
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int a=0;
        for(String s:patterns){
            if(word.indexOf(s)!=-1){
                a++;
            }
        }
        return a;
    }
}