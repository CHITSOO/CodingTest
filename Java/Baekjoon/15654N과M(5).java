import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int M;
    public static int[] arr;
    public static int[] arr2;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        arr2 = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());     
        }
        Arrays.sort(arr);
        
        dfs(0);
        System.out.println(sb.toString());
        br.close();
    }
    static void dfs(int curIdx){
        if(curIdx == M){
            for(int i = 0; i < M; i++){
            	sb.append(arr2[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i < N; i++){
            if(visited[i] == false){
                visited[i] = true;
                arr2[curIdx] = arr[i];
                dfs(curIdx + 1);
                visited[i] = false;
            }
        }
    }
}