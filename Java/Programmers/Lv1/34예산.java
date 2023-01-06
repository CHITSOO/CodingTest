import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        for(int n : d){
            if(sum + n > budget) break;
            sum += n;
            answer++;
        }
        return answer;
    }
}