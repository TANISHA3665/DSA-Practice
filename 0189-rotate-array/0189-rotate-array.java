class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        if(k == 0){
            return;
        }

        reverse(nums, 0, n - 1 - k);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public void reverse(int[] arr, int start, int end){
        while(start <= end){
            swap(arr, start++, end--);
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}