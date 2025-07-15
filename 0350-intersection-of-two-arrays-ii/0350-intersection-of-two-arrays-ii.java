class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int size = Math.min(nums1.length, nums2.length);

        int[] res = new int[size];
        int k = 0;

        for(int num: nums2){
            int count = map.getOrDefault(num, 0);

            if(count == 0){
                continue;
            }
            else{
                res[k++] = num;
                map.put(num, count - 1);
            }
        }
        
        return Arrays.copyOfRange(res, 0, k);
    }
}