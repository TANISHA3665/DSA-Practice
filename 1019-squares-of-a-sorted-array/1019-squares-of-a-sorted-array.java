import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        // Separate negative and positive numbers
        for (int num : nums) {
            if (num < 0) neg.add(num);
            else pos.add(num);
        }

        // Case 1: No negatives
        if (neg.isEmpty()) {
            for (int i = 0; i < n; i++) nums[i] *= nums[i];
            return nums;
        }

        // Case 2: No positives
        if (pos.isEmpty()) {
            for (int i = 0; i < n; i++) nums[i] *= nums[i];
            reverse(nums, 0, n - 1);
            return nums;
        }

        // Case 3: Both positives and negatives
        // Square positives
        for (int i = 0; i < pos.size(); i++) pos.set(i, pos.get(i) * pos.get(i));

        // Square negatives and reverse (to get ascending order)
        for (int i = 0; i < neg.size(); i++) neg.set(i, neg.get(i) * neg.get(i));
        Collections.reverse(neg);

        // Merge two sorted lists
        int i = 0; // pointer for pos
        int j = 0; // pointer for neg
        int idx = 0;
        int[] res = new int[pos.size() + neg.size()];

        while (i < pos.size() && j < neg.size()) {
            if (pos.get(i) < neg.get(j)) {
                res[idx++] = pos.get(i++);
            } else {
                res[idx++] = neg.get(j++);
            }
        }

        while (i < pos.size()) res[idx++] = pos.get(i++);
        while (j < neg.size()) res[idx++] = neg.get(j++);

        return res;
    }

    public void reverse(int[] arr, int i, int j) {
        while (i < j) swap(arr, i++, j--);
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
