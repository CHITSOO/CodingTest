class Solution {
    public int solution(int[][] sizes) {
        int max = sizes[0][0] > sizes[0][1] ? sizes[0][0] : sizes[0][1];
        int min = sizes[0][0] > sizes[0][1] ? sizes[0][1] : sizes[0][0];
        
        for(int i = 1; i < sizes.length; i++){    
            int max2 = sizes[i][0] > sizes[i][1] ? sizes[i][0] : sizes[i][1];
            int min2 = sizes[i][0] > sizes[i][1] ? sizes[i][1] : sizes[i][0];
            
            max = max > max2 ? max : max2;
            min = min > min2 ? min : min2;
            
        }
        return max * min;
    }
}