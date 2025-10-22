class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        //nums = [-4,-1,0,3,10] -> squared -> [16,1,0,9,100].

        for(int i = 0; i < n; i++){
            nums[i] = nums[i]* nums[i];
        }

        int i = 0;
        int j = n - 1;
        int idx = n - 1;
        int res[] = new int[n];

        while(i <= j){
            if(nums[i] > nums[j]){
                res[idx--] = nums[i++];
            }
            else{
                res[idx--] = nums[j--];
            }
        }
        return res;
    }
}