class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;

        for(int i = 0; i < accounts.length; i++){

            int currentSum = 0;

            for(int j = 0; j < accounts[i].length; j++){
                currentSum += accounts[i][j];
            }

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        
        return maxSum;
    }
}