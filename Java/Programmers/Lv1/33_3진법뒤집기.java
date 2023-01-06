import java.util.*;
class Solution {
    public int solution(int n) {
        Stack<Integer> stack = new Stack<>();
        //3진법으로 바꾸기 + 앞뒤반전하기
        while(n > 0){
            stack.push(n % 3);
            n /= 3;
        }
        
        //10진법으로 표현하기
        int answer = 0, i = 0;
        while(!stack.empty()){
            answer += stack.pop() * (int)Math.pow(3, i++);
        }
        return answer;
    }
}