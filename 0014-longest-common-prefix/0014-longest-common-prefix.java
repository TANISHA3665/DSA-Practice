// Optimized 
class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        while(i < first.length() && i < last.length()){
            if(first.charAt(i) != last.charAt(i)){
                return first.substring(0, i);
            }

            i++;
        }

        return first;
    }
}

// Time Complexity - O(n*logn)
// Space Complexity - O(1)