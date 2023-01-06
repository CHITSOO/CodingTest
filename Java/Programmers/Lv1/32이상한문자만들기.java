class Solution {
    public String solution(String s) {
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ') count++;
            else break;
        }
        
        String[] strs = s.split(" ");
        for(int i = 0; i < strs.length; i++){
            strs[i] = converse(strs[i]);
        }
        
        String answer = String.join(" ", strs);
        while(count-- > 0){
            answer += " ";
        }
        return answer;
    }
    
    String converse(String s){
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(i % 2 == 0) chars[i] = Character.toUpperCase(chars[i]);
            else chars[i] = Character.toLowerCase(chars[i]);
        }
        return String.valueOf(chars);
    }
}