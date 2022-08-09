package num25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Declaration of a Variable
		int total = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		int realPrice = 0;

		//Calculation
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); // ("String","Separator")
			int itemPrice = Integer.parseInt(st.nextToken());
			int itemAmount = Integer.parseInt(st.nextToken());

			realPrice = realPrice + (itemPrice * itemAmount);
		}

		//conditional statement
		if (total == realPrice) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
