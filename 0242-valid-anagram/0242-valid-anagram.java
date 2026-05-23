class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()){
           if(map.containsKey(ch)){
            map.put(ch, map.get(ch) + 1);
           }

           else{
            map.put(ch, 1);
           }
        }

        for(char ch: t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }

        for(int count: map.values()){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
}