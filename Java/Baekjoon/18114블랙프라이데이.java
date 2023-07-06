import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num == C) {
				System.out.println(1);
				return;
			}
			if(num < C) {
				list.add(num);
			}
		}
		Collections.sort(list);
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i + 1; j < list.size(); j++) {
				int sum = list.get(i) + list.get(j);
				if(sum == C) {
					System.out.println(1);
					return;
				} else if(sum > C) {
					continue;
				} else if(j < list.size()-1){
                    // // indexOf로 하니깐 안되고 binarySearch로 하니깐 됨.
					int idx = Collections.binarySearch(list, C-sum);
					if(idx >= 0 && idx != i && idx != j) {
						System.out.println(1);
						return;
					}
				}
			}
		}
		System.out.println(0);
	}
}