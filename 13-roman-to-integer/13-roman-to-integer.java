class Solution {
    public int romanToInt(String s) {
        int[] nums = new int[s.length()] ;
        char[] temp = s.toCharArray();
        
        for(int i = 0; i < temp.length; i++){
            switch(temp[i]){
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        int result = 0;
        int prev = 0;
        
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] < prev){
                result -= nums[i];
            }
            else{
                result += nums[i];
                prev = nums[i];
            }
        }
        return result;
    }
}