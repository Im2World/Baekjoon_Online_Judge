package num11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int caseNum = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < caseNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");    //("문자열","구분자") input
			
			//nextToken return type String
			sb.append("Case #"+ (i+1) + ": ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));		//입력된 숫자끼리 덧셈. 1 2 3 4 => 1 + 2 , 3 + 4
			sb.append('\n');
		}
		br.close();
		System.out.println(sb);
	}
}


/*
5
1 1
2 3
3 4
9 8
5 2
*/