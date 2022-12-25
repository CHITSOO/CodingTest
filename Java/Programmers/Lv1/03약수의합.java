class Solution {
    public int solution(int n) {
        int answer = 0;
        System.out.println((int)Math.sqrt(n));
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(i * i == n) answer += i;
            else if(n % i == 0) answer += (i + n / i);
        }
        return answer;
    }
}