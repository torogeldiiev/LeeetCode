class Solution {
    public int heightChecker(int[] heights) {
   
        int [] nums = new int [heights.length];
        int hui = 0;
            for(int i = 0; i < heights.length;i++){
            nums[i] = heights[i];
        }
        Arrays.sort(heights);
            for(int i = 0; i < heights.length;i++){
            if(nums[i] != heights[i])
            hui++;
        }
        
    
        return hui;
    }
}