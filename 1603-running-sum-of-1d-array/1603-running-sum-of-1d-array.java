class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int sum = nums[0];
        ans [0] = sum;

        for(int i = 1; i < n; i++){
            sum += nums[i];
            ans[i] = sum;
        }

        return ans;
    }
}