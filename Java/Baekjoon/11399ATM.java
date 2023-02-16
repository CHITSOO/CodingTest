import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] P; 

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        P = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
        	P[i] = Integer.parseInt(st.nextToken());
        }
        
        //풀이
        Solution s = new Solution();
        int answer = s.solution(N, P);

        //출력
        bw.write(String.valueOf(answer));
        bw.close();
    }
}

class Solution {
    public int solution(int N, int[] P) {
        int answer = 0;
        
    	Arrays.sort(P);
        for(int p : P) {
        	answer += p * N--; 
        }
        
        return answer;
    }
}