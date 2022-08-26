package num11022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int caseNum = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
 
		int a, b;
		
		for (int i = 0; i < caseNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");    //("문자열","구분자") input
			a = Integer.parseInt(st.nextToken());					//변수 값 갱신
			b = Integer.parseInt(st.nextToken());
			
			//nextToken return type String
			sb.append("Case #"+ (i+1) + ": ");
			sb.append(a + " + " + b + " " + "= " + (a+b));		//입력된 숫자끼리 덧셈. 1 2 3 4 => 1 + 2 , 3 + 4
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
Case #1: 1 + 1 = 2
Case #2: 2 + 3 = 5
Case #3: 3 + 4 = 7
Case #4: 9 + 8 = 17
Case #5: 5 + 2 = 7
*/