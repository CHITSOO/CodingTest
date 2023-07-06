import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		int count = 0;
		char pre = 'E';
		for(int i = 1; i < N; i++) {
			if(pre == 'E') {
				if(arr[i] == 'W') {
					count++;
					pre = 'W';
				}
			} else {
				if(arr[i] == 'E') {
					pre = 'E';
				}
			}
		}
		System.out.println(count);
	}
}