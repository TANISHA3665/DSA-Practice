class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        int j = 0;

        while(i < n){
            if(nums[i] != val){
                nums[j++] = nums[i++];
            }
            else{
                i++;
            }
        }

        return j;
    }
}