import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<String> list = new ArrayList<>();
		for(int i = 1; i <= N; i++) {
			list.add(String.valueOf(i));
		}
		
		String[] arr = new String[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			arr[i] = st.nextToken();
		}
		
		int answer = 0;
		int startIdx = 0;
		for(int i = 0; i < M; i++) {
			String target = arr[i];
			int targetIdx = list.indexOf(target);
			int nextIdx = targetIdx == list.size() - 1 ? 0  : targetIdx;
			
			int num = list.size();
			if(targetIdx > startIdx) {
				num = num - targetIdx + startIdx;
			} else {
				num = num - startIdx + targetIdx;
			}
			answer += Math.min((int)Math.abs(targetIdx - startIdx), num);
			
			list.remove(target);
			startIdx = nextIdx;
		}
		
		bw.write(String.valueOf(answer));
		br.close();
		bw.close();
	}
}