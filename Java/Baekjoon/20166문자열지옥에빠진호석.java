import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K, max;
    static char[][] board;
    static String[] strs;
    static Map<String, Integer> map;
    static int[] dx = {0,0,1,-1,1,1,-1,-1};
    static int[] dy = {1,-1,0,0,1,-1,1,-1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        board = new char[N][M];
        for(int i = 0; i < N; i++){
            board[i] = br.readLine().toCharArray();
        }
        strs = new String[K];
        map = new HashMap<>();
        for(int i = 0; i < K; i++){
            strs[i] = br.readLine();
            map.put(strs[i], 0);
            max = Math.max(max, strs[i].length());
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                search(i, j, board[i][j] + "");
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(map.get(str)).append("\n");
        }
        System.out.println(sb.toString());
    }
    static void search(int x, int y, String str){
        if(map.containsKey(str)){
            map.put(str, map.get(str) + 1);
        }
        
        if(str.length() == max) return;
        
        for(int i = 0; i < 8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx < 0) nx = N - 1; 
            else if(nx == N) nx = 0;
            
            if(ny < 0) ny = M - 1;
            else if(ny == M) ny = 0;
            
            search(nx, ny, str + board[nx][ny]);
        }
    }
}