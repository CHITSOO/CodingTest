
class Solution {
    public int[] solution(int n, int m) {
        int GCD = 0, LCM = 0; //GCD: 최대공약수, LCM: 최소공배수
        for(int i = 1; i < (m>n?m:n); i++){
            if(m % i == 0 && n % i == 0) GCD = i;
        }
        LCM = n * m / GCD;
        return new int[] {GCD, LCM};
    }
}

