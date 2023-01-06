class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' ') continue;
            else if(chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i]+n) > 'Z' ? 
                    (char)('A'-1 + (chars[i]+n)%'Z') : (char)(chars[i]+n);
            }
            else if(chars[i] >= 'a' && chars[i] <= 'z') 
                chars[i] = (char)(chars[i]+n) > 'z' ? 
                (char)('a'-1 + (chars[i]+n)%'z') : (char)(chars[i]+n);
        }
        
        return String.valueOf(chars);
    }
}