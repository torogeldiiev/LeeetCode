class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0,sum2 = 0;
        String aa = ""; 
        for(int i =0 ; i < nums.length;i++){
            sum+= nums[i];
            aa += nums[i];
        }
        char c[] = aa.toCharArray();
        for(int i = 0; i < aa.length();i++){
            int a = Character.getNumericValue(c[i]);
            sum2+= a;
        }
        int ans = sum - sum2;
        return ans;
    }
}