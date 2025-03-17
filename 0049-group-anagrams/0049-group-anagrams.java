class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            
            // Sort the string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String newStr = new String(charArray);

            // Make a key of the sorted string
            if(!map.containsKey(newStr)){
                map.put(newStr, new ArrayList<>());
            }

            map.get(newStr).add(str);
        }

        return new ArrayList(map.values());
    }
}