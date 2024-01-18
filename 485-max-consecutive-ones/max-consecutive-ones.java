class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 1,answer = 0,c = 0;
        for(int i = 0; i < nums.length - 1;i++){
            if(nums[i] == 1){
                if(nums[i] == nums[i + 1]){
                    counter++;
                }else {
                    answer = Math.max(counter,answer);
                    counter = 1;
                }
            }
            }
            for(int i = 0; i < nums.length;i++){
                if(nums[i] == 1)
                c++;
            }
        
        
        answer = Math.max(counter,answer);
        if(c == 0) return 0;
        return answer ;
    }
}