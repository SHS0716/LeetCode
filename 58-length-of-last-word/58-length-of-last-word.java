class Solution {
    public int lengthOfLastWord(String s) {
        if (!s.contains(" ")){
          return s.length();  
        }
        String [] ss = s.split(" ");
        if (ss.length == 0) {
            return 0;
        }
        return ss[ss.length-1].length();
    }
}