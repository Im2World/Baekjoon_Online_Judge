package num10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int caseNum = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < caseNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");    //("문자열","구분자")
			
			//nextToken return type String
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));		//입력된 숫자끼리 덧셈. 1 2 3 4 => 1 + 2 , 3 + 4
			sb.append('\n');
		}
 
		System.out.println(sb);

	}
}
