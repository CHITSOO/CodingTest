class Solution {
    public int solution(int[] numbers) {
        int answer = (9+1)*9/2;
        for(int n : numbers)
            answer -= n;
        return answer;
    }
}
