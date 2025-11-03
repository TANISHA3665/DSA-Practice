class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int low = 0;
        int high = 0;
        int n = nums.length;

        while(high < n){
            sum += nums[high];

            while(sum >= target){
                int len = (high - low + 1);
                minLength = Math.min(minLength, len);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}