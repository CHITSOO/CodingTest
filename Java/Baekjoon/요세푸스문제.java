import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<String> list = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			list.add(String.valueOf(i));
		}
		
		String[] strs = new String[N];
		int idx = 0, poppedIdx = 0;
		while(list.size() > 0) {
			poppedIdx += (K-1);
			while(poppedIdx >= list.size()) poppedIdx -= list.size();
			strs[idx++] = list.remove(poppedIdx);
		}
		
		String answer = "<";
		answer += String.join(", ", strs);
		bw.write(answer + ">");
		br.close();
		bw.close();
	}
}