class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            
            // Store in array
             int[] count = new int[26];

             for(char ch: str.toCharArray()){
                count[ch - 'a']++;
             }

             String key = Arrays.toString(count);

            // Make a key of the new string
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList(map.values());
    }
}