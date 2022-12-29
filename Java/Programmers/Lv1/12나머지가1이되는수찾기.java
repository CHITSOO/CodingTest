class Solution {
    public int solution(int n) {
        //(n-1)의 2이상 최소 약수
        for(int i = 2; i < n; i++){
            if((n-1) % i == 0) return i;
        }
        return n-1;
    }
}