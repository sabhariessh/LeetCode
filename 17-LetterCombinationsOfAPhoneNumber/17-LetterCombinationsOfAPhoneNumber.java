// Last updated: 03/07/2026, 11:41:03
class Solution {
    static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return res;
        solve(digits,0,"");
        return res;
    }
    void solve(String digits,int i,String cur){
        if(i==digits.length()){
            res.add(cur);
            return;
        }
        String letters = map[digits.charAt(i)-'0'];
        for(char c: letters.toCharArray()){
            solve(digits,i+1,cur+c);
        }
    }
}