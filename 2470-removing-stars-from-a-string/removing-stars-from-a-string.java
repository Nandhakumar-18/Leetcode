import java.util.Stack;
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(!stack.isEmpty()) stack.pop();
            }
            else stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack) sb.append(c);
        return sb.toString();
    }
}