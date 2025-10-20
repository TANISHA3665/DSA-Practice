class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 1;
        int j = 0;
        int unique = 1;

        while(i < n){
            if(nums[i] == nums[i-1]){
                if(unique < 2){
                    nums[j+1] = nums[i];
                    j++;
                    i++;
                    unique++;
                }
                else{
                    i++;
                    unique++;
                }
            }
            else{
                nums[j+1] = nums[i];
                j++;
                i++;
                unique = 1;
            }
        }
        return j+1;
    }
}