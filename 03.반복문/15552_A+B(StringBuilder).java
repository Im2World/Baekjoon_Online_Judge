//824ms
package num15552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_StringBuilder {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); // ("String","separator")

			// nextToken return type String
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())); // 1 2 3 4 => 1 + 2 , 3 + 4
			sb.append('\n');

		}

		System.out.println(sb);

		br.close();
	}
}
