class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        
        String intStr = Integer.valueOf(x).toString();
        
        int len = intStr.length();
        for(int i = 0; i < len/2; i++){
            if(intStr.charAt(i) != intStr.charAt(intStr.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    
}