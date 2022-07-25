class Solution {
    public boolean isValid(String s) {
        int str = s.length();
        
        if(str % 2 != 0) {return false;}
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < str; i++) {
            char curn = s.charAt(i);
            
            if(curn == '(' || curn == '{' || curn == '[') {
                stack.push(curn);
            }
            
            else if(stack.size() == 0) {return false;}
            
            else if(curn == ')') {
                if(stack.pop() != '(') {return false;}
            }
            else if(curn == '}') {
                if(stack.pop() != '{') {return false;}
            }
            else if(curn == ']') {
                if(stack.pop() != '[') {return false;}
            }
        }
        return stack.size() == 0;

    }
}