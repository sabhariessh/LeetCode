// Last updated: 03/07/2026, 11:40:09
class Solution {
    public int evalRPN(String[] tokens) {
     Stack <Integer> stack =new Stack<>();
     for(String d:tokens){
      if(d.equals("+")){
        stack.push(stack.pop() + stack.pop());
      }else if(d.equals("-")){
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b-a);
      }else if(d.equals("*")){
        stack.push(stack.pop()*stack.pop());
      }else if(d.equals("/")){
        int a = stack.pop();
        int b =stack.pop();
        stack.push(b/a);
      }else{
        stack.push(Integer.parseInt(d));
      }
     }
     return stack.pop();
    }
}