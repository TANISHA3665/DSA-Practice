class Solution {
    public int numberOfSteps(int num) {
        if(num == 0){
            return 0;
        }
        
        int steps = 0;

        while(num != 0){
            
            steps += (num & 1) == 0 ? 1 : 2;

            num >>= 1; 
        }

        return steps - 1;
    }
}