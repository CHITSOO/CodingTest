class Solution {
    public int solution(String s) {
        return s.charAt(0) == '-'? Integer.parseInt(s.substring(1))*(-1) :Integer.parseInt(s);
    }
}