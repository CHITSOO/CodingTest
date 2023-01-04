class Solution {
    public boolean solution(String s) {
        char [] chars = s.toCharArray();
        if(chars.length != 4 && chars.length != 6) return false;
        for(char ch : chars) {
            if(ch < '0' || ch > '9') return false;
        }        
        return true;
    }
}
