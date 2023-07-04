import java.io.*;
import java.util.*;

class Point{
    int x, y;
    String str;
    
    Point(int x, int y, String str){
        this.x = x;
        this.y = y;
        this.str = str;
    }
}

public class Main{
    static int N, M, K, max;
    static char[][] board;
    static String[] strs;
    static Map<String, Integer> map;
    static int[] dx = {0,0,1,-1,1,1,-1,-1};
    static int[] dy = {1,-1,0,0,1,-1,1,-1};
    public static void main(String[] args) throws IOException{
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
                search(i, j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < K; i++){
            sb.append(map.get(strs[i])).append("\n");
        }
        System.out.println(sb.toString());
    }
    static void search(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y, board[x][y]+""));
        
        while(!q.isEmpty()){
            Point cur = q.poll();
            if(map.containsKey(cur.str)){
                map.put(cur.str, map.get(cur.str) + 1);
            }
            if(cur.str.length() == max) continue;
            for(int i = 0; i < 8; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
            
                if(nx < 0) nx = N - 1;
                else if(nx >= N) nx = 0;
                if(ny < 0) ny = M - 1;
                else if(ny >= M) ny = 0;
            
                q.add(new Point(nx, ny, cur.str+board[nx][ny]));
            }
        }
        
    }
}