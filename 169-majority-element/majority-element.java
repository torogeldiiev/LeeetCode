class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
       int element = nums.length / 2;
       return nums[element];
    }
}