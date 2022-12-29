class Solution {
    boolean solution(String s) {
        String[] str = s.split("");
        int p = 0;
        int y = 0;
        for(String ch : str){
            if(ch.equals("p") || ch.equals("P")) p++;
            if(ch.equals("y") || ch.equals("Y")) y++;
        }
        if(p == y || (p == 0 && y == 0)) return true;
        else return false;
    }
}