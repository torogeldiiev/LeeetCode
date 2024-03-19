class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int [] arr = new int[len];
        if(k > nums.length){
            k = k % nums.length;
        }
        
        for(int i = len - k, j = 0; i < len;i++,j++){
            arr[j] = nums[i];
        }
        
        for(int i = 0, j = k;i < len - k;i++, j++){
            arr[j] = nums[i];
        }
        
        for(int i = 0 ; i < len;i++){
            nums[i] = arr[i];
        }
    }
}