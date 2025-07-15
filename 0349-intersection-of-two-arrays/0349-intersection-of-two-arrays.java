class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num: nums1){
            set1.add(num);
        }

        for(int num: nums2){
            set2.add(num);
        }

        int size = Math.min(set1.size(), set2.size());

        int k = 0;
        int[] res = new int[size];

        for(int num: set1){
            if(set2.contains(num)){
                res[k++] = num;
            }
        }

        return Arrays.copyOfRange(res, 0, k); 
    }
}