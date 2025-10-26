class Solution {
    public int strStr(String haystack, String needle) {
        int idx = -1;

        int m = haystack.length();
        int n = needle.length();

        if(n == 0){
            return 0;
        }

        if(n > m){
            return -1;
        }
        int i = 0; int j = 0; int k = 0;

        while(j < m){
            if(haystack.charAt(j) == needle.charAt(k)){
                j++;
                k++;

                if(k == n){
                    return i;
                };
            }
            else{
                i = i + 1;
                j = i;
                k = 0;
            }
        }

        return idx;
    }
}