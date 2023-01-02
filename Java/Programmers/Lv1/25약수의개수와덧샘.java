class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        //제곱근이 있으면 약수의 개수가 홀수
        for(int num = left; num <= right; num++){
            int n = (int)Math.sqrt(num);
            if(n * n == num) answer -= num;
            else answer += num;
        }
        return answer;
    }
}