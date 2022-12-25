class Solution {
    public int[] solution(long n) {
        int len = String.valueOf(n).split("").length;
        int[] answer = new int[len];
        int i = 0;
        while(n > 0){
            answer[i++] = (int)(n % 10);
            n /= 10;
        }
        
        return answer;
    }
}