class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int idx = 0;
        int i = 0;
        int j = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                res[idx++] = nums1[i];
                i++;
            }
            else{
                res[idx++] = nums2[j];
                j++;
            }
        }

        while(i < m){
            res[idx++] = nums1[i];
            i++;
        }

        while(j < n){
            res[idx++] = nums2[j];
            j++;
        }

        for(int k = 0 ; k < nums1.length; k++){
            nums1[k] = res[k];
        }

    }
}