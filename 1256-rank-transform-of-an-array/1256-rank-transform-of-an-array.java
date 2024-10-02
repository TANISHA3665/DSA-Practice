class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] result = new int [arr.length];
        int [] sortedArray = Arrays.copyOf(arr, arr.length);

        Arrays.sort(sortedArray);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
 
        int rank = 1;
        for(int val : sortedArray){
            if(!rankMap.containsKey(val)){
                rankMap.put(val, rank);
                rank++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}