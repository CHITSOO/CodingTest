class Solution {
    static int answer = 0;
    static int len;
    static int[] arr;
    static int[] temp = new int[3];
    
    public int solution(int[] number) {
        len = number.length;
        arr = number;
        combi(0,0);
        return answer;
    }
    
    private static void combi(int startIdx, int count){
        if(count == 3){
            int check = 0;
            for(int i = 0 ; i < 3; i++){
                check += temp[i];   
            }
            if(check == 0) answer++;
            return;
        }
        for(int i = startIdx; i < len; i++){
            temp[count] = arr[i];
            combi(i + 1, count + 1);
        }
    }
}