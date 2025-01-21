class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            
            int minIndex = i;
            
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            
            //swap
            
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}