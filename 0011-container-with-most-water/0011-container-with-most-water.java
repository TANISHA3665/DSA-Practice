class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int maxAmount = 0;
        int left = 0;
        int right = length - 1;

        while(left < right){
            int currAmount = Math.min(height[left], height[right]) * (right-left);
            maxAmount = Math.max(maxAmount, currAmount);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxAmount;
    }
}